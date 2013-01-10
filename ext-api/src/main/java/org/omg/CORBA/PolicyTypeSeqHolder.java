package org.omg.CORBA;

/**
 * Generated from IDL alias "PolicyTypeSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class PolicyTypeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public PolicyTypeSeqHolder ()
	{
	}
	public PolicyTypeSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PolicyTypeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyTypeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PolicyTypeSeqHelper.write (out,value);
	}
}
