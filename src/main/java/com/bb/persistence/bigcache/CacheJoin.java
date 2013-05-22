package com.bb.persistence.bigcache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Similar to a jpa mapping {@link ManyToOne}, {@link OneToOne}, this is a
 * joining/loading feature. 
 * 
 * It does not currently support {@link OneToMany} or {@link ManyToMany} type joins. 
 * 
 * Identifies a join point in an entity to fetch (only eagerly at this time),
 * when fetching an entity or cached entity, this will be a directive
 * to load {@link CacheEntity}.
 * 
 * It will introspect the field which is annotated by {@link CacheJoin}
 * to determine the type.
 * 
 * The mappedBy element will the field which is the stored primary key
 * of the cache of interest. 
 * 
 * @author msimonsen
 *
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CacheJoin {

	/**
	 * The jpa column field that represents the stored FK (K)
	 * to the {@link CacheEntity}.
	 * 
	 * @return
	 */
	String mappedBy();
}
