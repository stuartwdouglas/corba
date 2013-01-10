package org.omg.GIOP;

/**
 * Generated from IDL struct "LocateReplyHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class LocateReplyHeader_1_0Holder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.LocateReplyHeader_1_0 value;

	public LocateReplyHeader_1_0Holder ()
	{
	}
	public LocateReplyHeader_1_0Holder(final org.omg.GIOP.LocateReplyHeader_1_0 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.LocateReplyHeader_1_0Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.LocateReplyHeader_1_0Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.LocateReplyHeader_1_0Helper.write(_out, value);
	}
}
