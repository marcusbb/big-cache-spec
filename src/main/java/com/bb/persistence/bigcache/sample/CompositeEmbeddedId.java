package com.bb.persistence.bigcache.sample;

import com.bb.persistence.bigcache.CompositeMember;


public class CompositeEmbeddedId {

	@CompositeMember
	Long id1;
	
	@CompositeMember
	Long id2;
	
	String status; //some possible status
}
