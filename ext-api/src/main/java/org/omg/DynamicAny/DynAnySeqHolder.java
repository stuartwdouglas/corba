package org.omg.DynamicAny;

/**
 * Generated from IDL alias "DynAnySeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynAnySeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.DynAny[] value;

	public DynAnySeqHolder ()
	{
	}
	public DynAnySeqHolder (final org.omg.DynamicAny.DynAny[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DynAnySeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynAnySeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DynAnySeqHelper.write (out,value);
	}
}
