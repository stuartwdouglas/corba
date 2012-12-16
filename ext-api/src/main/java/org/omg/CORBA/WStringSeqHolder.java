package org.omg.CORBA;

/**
 * Generated from IDL alias "WStringSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class WStringSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public WStringSeqHolder ()
	{
	}
	public WStringSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WStringSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WStringSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WStringSeqHelper.write (out,value);
	}
}
