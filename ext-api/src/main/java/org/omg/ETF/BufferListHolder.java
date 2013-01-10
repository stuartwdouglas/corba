package org.omg.ETF;

/**
 * Generated from IDL interface "BufferList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class BufferListHolder	implements org.omg.CORBA.portable.Streamable{
	 public BufferList value;
	public BufferListHolder()
	{
	}
	public BufferListHolder (final BufferList initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BufferListHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BufferListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BufferListHelper.write (_out,value);
	}
}
