package org.omg.dds;
/**
 * Generated from IDL enum "HistoryQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class HistoryQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public HistoryQosPolicyKind value;

	public HistoryQosPolicyKindHolder ()
	{
	}
	public HistoryQosPolicyKindHolder (final HistoryQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HistoryQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HistoryQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HistoryQosPolicyKindHelper.write (out,value);
	}
}
