package org.omg.GIOP;

/**
 * Generated from IDL struct "MessageHeader_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class MessageHeader_1_1Holder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.MessageHeader_1_1 value;

	public MessageHeader_1_1Holder ()
	{
	}
	public MessageHeader_1_1Holder(final org.omg.GIOP.MessageHeader_1_1 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.MessageHeader_1_1Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.MessageHeader_1_1Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.MessageHeader_1_1Helper.write(_out, value);
	}
}
