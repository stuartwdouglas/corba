package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL alias "AdminIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class AdminIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public AdminIDSeqHolder ()
	{
	}
	public AdminIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdminIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AdminIDSeqHelper.write (out,value);
	}
}
