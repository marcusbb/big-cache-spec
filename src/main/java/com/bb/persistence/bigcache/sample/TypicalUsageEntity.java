package com.bb.persistence.bigcache.sample;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bb.persistence.bigcache.CacheEntity;
import com.bb.persistence.bigcache.CacheKey;
import com.bb.persistence.bigcache.CacheKeyType;
import com.bb.persistence.bigcache.CacheType;
import com.bb.persistence.bigcache.Index;




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
