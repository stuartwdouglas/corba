package org.omg.SecurityReplaceable;

/**
 * Generated from IDL interface "ClientSecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class ClientSecurityContextHolder	implements org.omg.CORBA.portable.Streamable{
	 public ClientSecurityContext value;
	public ClientSecurityContextHolder()
	{
	}
	public ClientSecurityContextHolder (final ClientSecurityContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ClientSecurityContextHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClientSecurityContextHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ClientSecurityContextHelper.write (_out,value);
	}
}
