package org.omg.GSSUP;

/**
 * Generated from IDL struct "InitialContextToken".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class InitialContextToken
	implements org.omg.CORBA.portable.IDLEntity
{
	public InitialContextToken(){}
	public byte[] username;
	public byte[] password;
	public byte[] target_name;
	public InitialContextToken(byte[] username, byte[] password, byte[] target_name)
	{
		this.username = username;
		this.password = password;
		this.target_name = target_name;
	}
}
