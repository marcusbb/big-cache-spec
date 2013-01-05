package provision.persistence.bigcache.sample_usage;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import provision.persistence.bigcache.CacheEntity;
import provision.persistence.bigcache.CacheKey;
import provision.persistence.bigcache.CacheKeyType;
import provision.persistence.bigcache.CacheType;
import provision.persistence.bigcache.Index;



@Entity //this indicates that it is indeed a stored DB Entity
@CacheEntity(type=CacheType.DISTRIBUTED)

public class TypicalUsageEntity {

	
	@Column
	@Id
	private Long id;
	
	@CacheKey(type=CacheKeyType.PRIMARY)
	private String naturalKey;
	
	@CacheKey(type=CacheKeyType.UNIQUE)
	@Column()
	private String secondaryKey;
	
	@Index
	@Column
	private String indexableColumn;
	
	
	@OneToMany
	private List<TypicalChild> children;
	
}
