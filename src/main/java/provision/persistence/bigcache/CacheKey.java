package provision.persistence.bigcache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Entity;

/**
 * A cache (a {@link CacheEntity}) can have more than one key.
 * 
 * It may be a likelihood that there is a difference between a
 * primary key and a secondary (set of) natural key(s), hence there is a key type
 * 
 * The key of the cache may not necessarily be the key of the associated {@link Entity}.
 * 
 * Every key has a associated penalty associated with the construction and distribution of
 * that set of keys.  A well optimized system will generally have key affinity
 * and be able to perform write operations with less chatter.
 * 
 * The offset of having fetches of those objects will cause more network over-head, although
 * it could be a split cache, where we store the primary key cache and all associated indexes
 * separately - this is left as an implementation exercise.
 * 
 * 
 * @author msimonsen
 *
 */
//not tested with method based annotations
@Retention(value=RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface CacheKey {

	CacheKeyType type() default CacheKeyType.PRIMARY;
	
	
	boolean embedded() default false;
}

