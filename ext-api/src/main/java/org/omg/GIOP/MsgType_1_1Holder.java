package org.omg.GIOP;
/**
 * Generated from IDL enum "MsgType_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class MsgType_1_1Holder
	implements org.omg.CORBA.portable.Streamable
{
	public MsgType_1_1 value;

	public MsgType_1_1Holder ()
	{
	}
	public MsgType_1_1Holder (final MsgType_1_1 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MsgType_1_1Helper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MsgType_1_1Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MsgType_1_1Helper.write (out,value);
	}
}
