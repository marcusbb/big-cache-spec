package com.bb.persistence.bigcache;

/**
 * 
 * @author msimonsen
 *
 */
public enum CacheWriteStrategy {

	//write behind may currently have some 
	//limitations - to document
	WRITE_THROUGH,
	WRITE_BEHIND, 
	WRITE_NONE; 
}
