package provision.persistence.bigcache.sample_usage;

import javax.persistence.Column;
import javax.persistence.Entity;

import provision.persistence.bigcache.CacheEntity;
import provision.persistence.bigcache.CacheKey;
import provision.persistence.bigcache.CacheKeyType;

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
