package com.bb.persistence.bigcache.sample;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.bb.persistence.bigcache.CacheEntity;
import com.bb.persistence.bigcache.CacheKey;
import com.bb.persistence.bigcache.CacheKeyType;




@Entity
@CacheEntity
public class CompositeEmbeddedEntity {

	@CacheKey(embedded=true,type=CacheKeyType.COMPOSITE)
	@Embedded 
	@Id
	CompositeEmbeddedId pk;
	
}
