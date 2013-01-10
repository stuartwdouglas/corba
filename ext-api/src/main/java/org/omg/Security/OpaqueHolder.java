package org.omg.Security;

/**
 * Generated from IDL alias "Opaque".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class OpaqueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public OpaqueHolder ()
	{
	}
	public OpaqueHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OpaqueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OpaqueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OpaqueHelper.write (out,value);
	}
}
