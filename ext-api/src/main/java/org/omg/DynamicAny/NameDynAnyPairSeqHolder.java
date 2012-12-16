package org.omg.DynamicAny;

/**
 * Generated from IDL alias "NameDynAnyPairSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameDynAnyPairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.NameDynAnyPair[] value;

	public NameDynAnyPairSeqHolder ()
	{
	}
	public NameDynAnyPairSeqHolder (final org.omg.DynamicAny.NameDynAnyPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameDynAnyPairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameDynAnyPairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameDynAnyPairSeqHelper.write (out,value);
	}
}
