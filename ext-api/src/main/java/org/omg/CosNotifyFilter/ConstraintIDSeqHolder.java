package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "ConstraintIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ConstraintIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ConstraintIDSeqHolder ()
	{
	}
	public ConstraintIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintIDSeqHelper.write (out,value);
	}
}
