package provision.persistence.bigcache;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;




/**
 * A child entity of a cached entity {@link CacheEntity}.
 * 
 * You MUST have {@link CacheChildEntity} annotations for 
 * entities that have parent {@link CacheEntity} descendants.
 * 
 * 
 * The reason why this class exists is to mark the entries
 * in an object graph that are persisted at the child level.
 * Not at the parent (cached) level.
 * 
 * If you want to have children that are cached as well, then
 * use {@link CacheEntity}.  This requires that {@link ParentRef}/
 * {@link ParentKey} is defined.
 * 
 * Writes through the child must inform the cache to refresh or
 * otherwise synchronize the cache.
 * This will allow the repository implementation {@link Repository} 
 * on writes -  insert/update/put/delete to be detected and handled
 * properly.
 * 
 * This is a side effect of being dependent on JPA and object graphs
 * that are stored from a non-root location.
 * 
 * 
 * Ideally we won't have writes to children through the repository but it is a valid
 * use case.  And repository must be informed of writes - this is why it's critical that
 * writes must be written through the repository 
 * 
 * 
 * 
 * 
 * @author msimonsen
 *
 */

@Target(TYPE) 
@Retention(RUNTIME)
public @interface CacheChildEntity {
	
		
}
