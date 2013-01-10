package org.omg.CSIIOP;

/**
 * Generated from IDL struct "ServiceConfiguration".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ServiceConfiguration
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceConfiguration(){}
	public int syntax;
	public byte[] name;
	public ServiceConfiguration(int syntax, byte[] name)
	{
		this.syntax = syntax;
		this.name = name;
	}
}
