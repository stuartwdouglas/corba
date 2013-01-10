package org.omg.CosNotification;

/**
 * Generated from IDL alias "NamedPropertyRangeSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class NamedPropertyRangeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.NamedPropertyRange[] value;

	public NamedPropertyRangeSeqHolder ()
	{
	}
	public NamedPropertyRangeSeqHolder (final org.omg.CosNotification.NamedPropertyRange[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamedPropertyRangeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamedPropertyRangeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamedPropertyRangeSeqHelper.write (out,value);
	}
}
