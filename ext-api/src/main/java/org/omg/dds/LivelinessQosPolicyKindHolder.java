package org.omg.dds;
/**
 * Generated from IDL enum "LivelinessQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class LivelinessQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public LivelinessQosPolicyKind value;

	public LivelinessQosPolicyKindHolder ()
	{
	}
	public LivelinessQosPolicyKindHolder (final LivelinessQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LivelinessQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LivelinessQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LivelinessQosPolicyKindHelper.write (out,value);
	}
}
