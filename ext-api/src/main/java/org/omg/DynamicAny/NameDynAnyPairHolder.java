package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameDynAnyPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameDynAnyPairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.NameDynAnyPair value;

	public NameDynAnyPairHolder ()
	{
	}
	public NameDynAnyPairHolder(final org.omg.DynamicAny.NameDynAnyPair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DynamicAny.NameDynAnyPairHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DynamicAny.NameDynAnyPairHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DynamicAny.NameDynAnyPairHelper.write(_out, value);
	}
}
