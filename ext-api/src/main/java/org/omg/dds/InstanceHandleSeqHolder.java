package org.omg.dds;

/**
 * Generated from IDL alias "InstanceHandleSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class InstanceHandleSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public InstanceHandleSeqHolder ()
	{
	}
	public InstanceHandleSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InstanceHandleSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InstanceHandleSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InstanceHandleSeqHelper.write (out,value);
	}
}
