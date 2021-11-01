/**
 * 
 */
package com.secureuser.entity;

/**
 * @author kmahendr
 * 
 * This Class Provides jwt response token in authentication responses
 *
 */
public class AuthenticationResponse {
	
	
	private String jwt;
	private String userrole;

	
	
	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public AuthenticationResponse(String jwt, String userrole) {
		super();
		this.jwt = jwt;
		this.userrole = userrole;
	}

	/**
	 * 
	 */
	public AuthenticationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jwt
	 */
	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	/**
	 * @param jwt the jwt to set
	 */
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	

}
