package provision.persistence.bigcache;


/**
 * Marshaler abstraction.
 * 
 * 
 * @author msimonsen
 *
 */
public interface Marshaller {

	public byte[] marshall(Object obj);
	
	public Object unmarshall(byte []b);
}
