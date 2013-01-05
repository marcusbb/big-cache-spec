package provision.persistence.bigcache.sample_usage;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import provision.persistence.bigcache.CacheEntity;
import provision.persistence.bigcache.CacheKey;
import provision.persistence.bigcache.CacheKeyType;



@Entity
@CacheEntity
public class CompositeEmbeddedEntity {

	@CacheKey(embedded=true,type=CacheKeyType.COMPOSITE)
	@Embedded 
	@Id
	CompositeEmbeddedId pk;
	
}
