package org.omg.ETF;

/**
 * Generated from IDL alias "Buffer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class BufferHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public BufferHolder ()
	{
	}
	public BufferHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BufferHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BufferHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BufferHelper.write (out,value);
	}
}
