package org.omg.CSI;

/**
 * Generated from IDL alias "OID".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class OIDHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public OIDHolder ()
	{
	}
	public OIDHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OIDHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OIDHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OIDHelper.write (out,value);
	}
}
