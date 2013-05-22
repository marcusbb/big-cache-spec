package com.bb.persistence.bigcache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Demarcate a composite key identifier.
 * 
 * To be used in conjunction with {@link CacheKeyType#COMPOSITE}
 * 
 *  
 * @author msimonsen
 *
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface CompositeMember {

}
