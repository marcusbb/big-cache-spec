package com.bb.persistence.bigcache;

/**
 * Wrap various configuration exceptions, including reflection based
 * ones indicating usage or client configuration problems.
 * 
 * 
 * @author msimonsen
 *
 */
public class CacheConfigurationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8912439764586717591L;

	public CacheConfigurationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CacheConfigurationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CacheConfigurationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CacheConfigurationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
