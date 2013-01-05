package provision.persistence.bigcache.sample_usage;

import provision.persistence.bigcache.CompositeMember;


public class CompositeEmbeddedId {

	@CompositeMember
	Long id1;
	
	@CompositeMember
	Long id2;
	
	String status; //some possible status
}
