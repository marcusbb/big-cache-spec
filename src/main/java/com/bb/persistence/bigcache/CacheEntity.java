package com.bb.persistence.bigcache;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;





/**
 * A cached entity.
 * This will be decorated for entities, of which 
 * writes through the repository will be cached.
 * similarly cache misses will hit the underlying permanent storage
 * and read through the cache
 * 
 * Why not support the JPA specification?  Good question.
 * It's largely because cache has different concerns than persistence.
 * 
 * Also there is a gap in JPA, such as indexes and key information.
 * 
 * Questions:
 * How will we lazy load when only storing portions of the entity, and not the 
 * whole graph?  This will be a likely difficiency in the first round, where
 * non-attached objects will not have lazy loading capabilities.  If objects
 * are read through the repository however, there could be a detection mechanism
 * to ensure all parts of graph are loaded.
 * Therefore, a strategy to cache at transaction completion is a good one, since
 * this probably represents the best snapshot of the object graph.  
 * 
 * Object re-attachment?  How will one associate an object in an {@link EntityManager}
 * It's likely that we can re-attach by virtue of a read/write through - but this is
 * not ideal - it means a read before the write from storage.
 * The mergeable ( {@link Mergeable} ) strategy may help us now.
 * 
 * Write strategy.  For simplicity a write-through strategy would be the path of least
 * resistance.
 * Write behind will come with some feature limitations.
 * - loose write behind on subsequent read - particularly cache based
 * This is generally a jpa provider strategy as well. 
 * 
 * For write behind all cached entities will hold to a "READ COMMITTED" model
 *  where writes will be queued and then flushed on a transaction
 *  {@link Transaction} commit.  
 *  Write through will rely on the isolation level of the DB, as we'll persist
 *  first before writing through the cache.
 *  
 *  Failure on cache writes.  On a synchronous write model this may result in a transaction 
 *  rollback.  
 *  
 * 
 *  
 * @author msimonsen
 *
 */

@Target(TYPE) 
@Retention(RUNTIME)

public @interface CacheEntity {

	
	CacheType type() default CacheType.DISTRIBUTED;
	
	/**
	 * This is likely to be globally based particularly if there are 
	 * intersecting object graphs.
	 * 
	 * @return
	 */
	CacheWriteStrategy writeStrategy() default CacheWriteStrategy.WRITE_THROUGH;
	
	/**
	 * NOT IMPLEMENTED.
	 * @return
	 */
	Class <? extends Marshaller> marshaller() default SerializableMarshaller.class;
	
	/**
	 * If write through the repository is not of type {@link Mergeable}
	 * then if this flag is set to true, then all fields that are
	 * not immutable, or have the {@link NoMergeableField} annotation will 
	 * be exempt from merging concerns 
	 *  
	 * NOT YET IMPLEMENTED
	 *  
	 * @return
	 */
	boolean mergeable() default false;
}
