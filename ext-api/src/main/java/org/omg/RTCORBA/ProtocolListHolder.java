package org.omg.RTCORBA;

/**
 * Generated from IDL alias "ProtocolList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ProtocolListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.RTCORBA.Protocol[] value;

	public ProtocolListHolder ()
	{
	}
	public ProtocolListHolder (final org.omg.RTCORBA.Protocol[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtocolListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtocolListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtocolListHelper.write (out,value);
	}
}
