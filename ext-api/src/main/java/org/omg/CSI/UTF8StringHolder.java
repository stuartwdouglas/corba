package org.omg.CSI;

/**
 * Generated from IDL alias "UTF8String".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class UTF8StringHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public UTF8StringHolder ()
	{
	}
	public UTF8StringHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return UTF8StringHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = UTF8StringHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		UTF8StringHelper.write (out,value);
	}
}
