package com.bb.persistence.bigcache;

/**
 * The type of key that {@link CacheKey} that an Entity {@link CacheEntity}
 * can have.
 * 
 * What is the implication for these types:
 * 
 * Each type will have a unique representation in the underlying data grid.
 * Either in a distributed or near cache representation.
 * 
 * PRIMARY - the main key by which the entity will be referenced.
 * This will also serve as the value of other indexes, or possibly a composite key.
 * The primary key value can not change.  It's the main intent that the cache primary
 * key is also the storage primary key.
 * 
 * COMPOSITE (PRIMARY_KEY) - this serves mainly to add value to type that have data entities
 *  that are composite keys - typically join type tables that service a many-many
 *  relationship.  This will facilitate efficient look ups when the main mechanism
 *  for lookup is by any one member of the composite key.
 *  The members of the keys are themselves not unique but the composition will form
 *  uniqueness.
 *   
 *  
 * UNIQUE - this is a unique key that is independent of the PRIMARY key.
 * Unique keys are not tolerated to be null on puts.
 * 
 * 
 * @author msimonsen
 *
 */
public enum CacheKeyType {

	PRIMARY,UNIQUE,COMPOSITE;
	
	//other considerations:
	//if we don't do deep introspection
	//PRIMARY_COMPOSITE,UNIQUE_COMPOSITE
}
