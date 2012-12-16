package org.omg.IOP;

/**
 * Generated from IDL struct "Encoding".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class EncodingHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.Encoding value;

	public EncodingHolder ()
	{
	}
	public EncodingHolder(final org.omg.IOP.Encoding initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IOP.EncodingHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IOP.EncodingHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IOP.EncodingHelper.write(_out, value);
	}
}
