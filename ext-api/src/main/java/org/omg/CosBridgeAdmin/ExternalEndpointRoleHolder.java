package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "ExternalEndpointRole".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointRoleHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ExternalEndpointRole value;

	public ExternalEndpointRoleHolder ()
	{
	}
	public ExternalEndpointRoleHolder (final ExternalEndpointRole initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExternalEndpointRoleHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExternalEndpointRoleHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExternalEndpointRoleHelper.write (out,value);
	}
}
