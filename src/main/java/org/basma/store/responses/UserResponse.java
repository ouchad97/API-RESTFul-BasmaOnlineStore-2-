package org.basma.store.responses;

public class UserResponse {
	private String nomUser;
	private String prenomUser;
	private String email;	
	private String roleUser;
 
	 
 

	public String getRoleUser() {
		return roleUser;
	}


	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}


	public String getNomUser() {
		return nomUser;
	}


	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}


	public String getPrenomUser() {
		return prenomUser;
	}


	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}
