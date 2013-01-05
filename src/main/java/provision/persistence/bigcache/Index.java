package provision.persistence.bigcache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A secondary index on an entity that will be managed by the cache
 * and not the underlying storage.
 * 
 * How are indexes handled?  This is left to the implementation but 
 * could be represented as Key/Collection(List) sets.
 * 
 * Each change to an entity via it's indexed attributes, will affect
 * the index cache, hence entities with large amounts of indexes
 * will generally have slower performance on puts then non-indexed
 * entities.
 * 
 * 
 * @author msimonsen
 *
 */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Index {

	boolean ordered() default false;
	
}
