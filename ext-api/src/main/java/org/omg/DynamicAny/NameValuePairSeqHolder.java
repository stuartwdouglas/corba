package org.omg.DynamicAny;

/**
 * Generated from IDL alias "NameValuePairSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameValuePairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.NameValuePair[] value;

	public NameValuePairSeqHolder ()
	{
	}
	public NameValuePairSeqHolder (final org.omg.DynamicAny.NameValuePair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameValuePairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameValuePairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameValuePairSeqHelper.write (out,value);
	}
}
