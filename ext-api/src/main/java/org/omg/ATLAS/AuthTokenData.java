package org.omg.ATLAS;

/**
 * Generated from IDL struct "AuthTokenData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class AuthTokenData
	implements org.omg.CORBA.portable.IDLEntity
{
	public AuthTokenData(){}
	public org.omg.CSI.IdentityToken[] ident_token;
	public org.omg.CSI.AuthorizationElement[] auth_token;
	public org.omg.TimeBase.UtcT[] expiry_time;
	public AuthTokenData(org.omg.CSI.IdentityToken[] ident_token, org.omg.CSI.AuthorizationElement[] auth_token, org.omg.TimeBase.UtcT[] expiry_time)
	{
		this.ident_token = ident_token;
		this.auth_token = auth_token;
		this.expiry_time = expiry_time;
	}
}
