package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "ConstraintExpSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ConstraintExpSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.ConstraintExp[] value;

	public ConstraintExpSeqHolder ()
	{
	}
	public ConstraintExpSeqHolder (final org.omg.CosNotifyFilter.ConstraintExp[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintExpSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintExpSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintExpSeqHelper.write (out,value);
	}
}
