package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "MappingConstraintPairSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class MappingConstraintPairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.MappingConstraintPair[] value;

	public MappingConstraintPairSeqHolder ()
	{
	}
	public MappingConstraintPairSeqHolder (final org.omg.CosNotifyFilter.MappingConstraintPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MappingConstraintPairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingConstraintPairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MappingConstraintPairSeqHelper.write (out,value);
	}
}
