package org.omg.CORBA;

/**
 * Generated from IDL alias "ContainedSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ContainedSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Contained[] value;

	public ContainedSeqHolder ()
	{
	}
	public ContainedSeqHolder (final org.omg.CORBA.Contained[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ContainedSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContainedSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ContainedSeqHelper.write (out,value);
	}
}
