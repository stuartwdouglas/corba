package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL alias "ChannelIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ChannelIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ChannelIDSeqHolder ()
	{
	}
	public ChannelIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ChannelIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ChannelIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ChannelIDSeqHelper.write (out,value);
	}
}
