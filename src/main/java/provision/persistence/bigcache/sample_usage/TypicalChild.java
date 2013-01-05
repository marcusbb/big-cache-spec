package provision.persistence.bigcache.sample_usage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import provision.persistence.bigcache.CacheChildEntity;
import provision.persistence.bigcache.CacheEntity;
import provision.persistence.bigcache.CacheKey;
import provision.persistence.bigcache.CacheKeyType;
import provision.persistence.bigcache.ParentRef;

@Entity
@CacheEntity
public class TypicalChild {

	@Id
	@CacheKey(type=CacheKeyType.PRIMARY)
	private String id;
	
	@ParentRef
	@ManyToOne //indicating jpa parent
	private TypicalUsageEntity parent;
	
}
