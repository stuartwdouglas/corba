package org.omg.RTCORBA;

/**
 * Generated from IDL interface "TCPProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TCPProtocolPropertiesHolder	implements org.omg.CORBA.portable.Streamable{
	 public TCPProtocolProperties value;
	public TCPProtocolPropertiesHolder()
	{
	}
	public TCPProtocolPropertiesHolder (final TCPProtocolProperties initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TCPProtocolPropertiesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCPProtocolPropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TCPProtocolPropertiesHelper.write (_out,value);
	}
}
