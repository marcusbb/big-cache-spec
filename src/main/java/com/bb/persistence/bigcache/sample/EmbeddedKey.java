package com.bb.persistence.bigcache.sample;

import javax.persistence.Embeddable;

/**
 * Embedded, composite primary key example.
 * 
 * @author msimonsen
 *
 */
@Embeddable
public class EmbeddedKey {

	Long id1;
	
	Long id2;
	
	String status; //some possible status
}
