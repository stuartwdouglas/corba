package org.omg.RTCORBA;

/**
 * Generated from IDL interface "ProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ProtocolPropertiesHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProtocolProperties value;
	public ProtocolPropertiesHolder()
	{
	}
	public ProtocolPropertiesHolder (final ProtocolProperties initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProtocolPropertiesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtocolPropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProtocolPropertiesHelper.write (_out,value);
	}
}
