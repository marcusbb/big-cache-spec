package provision.persistence.bigcache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  
 * This is a necessary non elegant piece which will require the client to provide.
 * 
 * For writes through the system, the reference to the parent must be provided.
 * The parent must also be a valid cached entity {@link CacheEntity} or {@link CacheChildEntity}
 *
 * 
 * @author msimonsen
 *
 */

@Retention(value=RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Parent {

}
