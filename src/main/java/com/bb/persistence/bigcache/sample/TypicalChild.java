package com.bb.persistence.bigcache.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bb.persistence.bigcache.CacheChildEntity;
import com.bb.persistence.bigcache.CacheEntity;
import com.bb.persistence.bigcache.CacheKey;
import com.bb.persistence.bigcache.CacheKeyType;
import com.bb.persistence.bigcache.ParentRef;


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
