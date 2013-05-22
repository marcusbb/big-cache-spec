package com.bb.persistence.bigcache;

/**
 * Variations of cache.
 * 
 * Currently support for either full_replicated or distributed will be attempted.
 * 
 *  
 *  What happens when entity graphs cross?
 *  Likely we will have duplication of cache, as the graphs could be contained
 *  in completely separate spaces.
 *  
 *  We could have a concept of affinity in the data.
 *  
 *  Therefore it's important to know if your group of entities will need to be 
 *  one or the other.
 *  If there is some overlap in the children?
 *  The cache will be duplicated, and hence less efficient from a memory perspective.
 *  

 	should have not have any synchronization issues for separate transactions.
 *  
 *  
 *  I will be leaving the configuration of the cache to a separate exercise.
 *  This will likely be vendor(s) specific and could vary.
 *  
 *  
 * @author msimonsen
 *
 */
public enum CacheType {

	//DISTRIBUTED == partitioned
	NEAR,NEAR_REPLICATED,
	
	//NOT SUPPORTED YET
	DISTRIBUTED;
	
	
	
}
