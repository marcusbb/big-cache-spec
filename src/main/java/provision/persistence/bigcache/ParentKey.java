package provision.persistence.bigcache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Same concept as {@link ParentRef} but this is the stored key of the parent.
 * 
 * {@link ParentKey} and {@link ParentRef} are mutually exclusive.
 * 
 * @author msimonsen
 *
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface ParentKey {

	Class<CacheEntity> pareentClass();
}
