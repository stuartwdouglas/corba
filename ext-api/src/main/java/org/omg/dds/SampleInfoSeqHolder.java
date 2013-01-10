package org.omg.dds;

/**
 * Generated from IDL alias "SampleInfoSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SampleInfo[] value;

	public SampleInfoSeqHolder ()
	{
	}
	public SampleInfoSeqHolder (final org.omg.dds.SampleInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleInfoSeqHelper.write (out,value);
	}
}
