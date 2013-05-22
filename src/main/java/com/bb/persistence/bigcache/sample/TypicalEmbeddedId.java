package com.bb.persistence.bigcache.sample;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.bb.persistence.bigcache.CacheEntity;
import com.bb.persistence.bigcache.CacheKey;
import com.bb.persistence.bigcache.CacheKeyType;


/**
 * Embedded, single key - not {@link CacheKeyType#COMPOSITE}
 * 
 * @author msimonsen
 *
 */
@CacheEntity
@Entity(name="TypicalEmbedded")
public class TypicalEmbeddedId {

	/**
	 * Following the semantics of JPA - composite IDs must
	 * be embedded.
	 * 
	 */
	@CacheKey(type=CacheKeyType.PRIMARY,embedded=true)
	@Column
	private EmbeddedKey id;
	
	
}
