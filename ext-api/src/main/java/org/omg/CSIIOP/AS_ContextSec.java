package org.omg.CSIIOP;

/**
 * Generated from IDL struct "AS_ContextSec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AS_ContextSec
	implements org.omg.CORBA.portable.IDLEntity
{
	public AS_ContextSec(){}
	public short target_supports;
	public short target_requires;
	public byte[] client_authentication_mech;
	public byte[] target_name;
	public AS_ContextSec(short target_supports, short target_requires, byte[] client_authentication_mech, byte[] target_name)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.client_authentication_mech = client_authentication_mech;
		this.target_name = target_name;
	}
}
