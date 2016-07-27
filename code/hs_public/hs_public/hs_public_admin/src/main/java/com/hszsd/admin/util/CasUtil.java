package com.hszsd.admin.util;

import java.io.Serializable;

public class CasUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6613605690711113181L;
	private String casUrl;
	private String clientId;
	private String clientSecret;
	private String grantType;
	private String redirectUri;
	
	

	public String getCasUrl() {
		return casUrl;
	}
	public void setCasUrl(String casUrl) {
		this.casUrl = casUrl;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getGrantType() {
		return grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}
	public String getRedirectUri() {
		return redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}
	
}
