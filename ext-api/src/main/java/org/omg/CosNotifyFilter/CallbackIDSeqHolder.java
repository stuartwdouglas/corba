package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "CallbackIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class CallbackIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public CallbackIDSeqHolder ()
	{
	}
	public CallbackIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallbackIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallbackIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CallbackIDSeqHelper.write (out,value);
	}
}
