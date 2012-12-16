package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "MappingConstraintInfoSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class MappingConstraintInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.MappingConstraintInfo[] value;

	public MappingConstraintInfoSeqHolder ()
	{
	}
	public MappingConstraintInfoSeqHolder (final org.omg.CosNotifyFilter.MappingConstraintInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MappingConstraintInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingConstraintInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MappingConstraintInfoSeqHelper.write (out,value);
	}
}
