package org.omg.dds;

/**
 * Generated from IDL alias "InstanceStateSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class InstanceStateSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public InstanceStateSeqHolder ()
	{
	}
	public InstanceStateSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InstanceStateSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InstanceStateSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InstanceStateSeqHelper.write (out,value);
	}
}
