package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL alias "SequenceNumbers".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class SequenceNumbersHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public SequenceNumbersHolder ()
	{
	}
	public SequenceNumbersHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SequenceNumbersHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceNumbersHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SequenceNumbersHelper.write (out,value);
	}
}
