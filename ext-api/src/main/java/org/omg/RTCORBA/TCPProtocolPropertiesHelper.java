package org.omg.RTCORBA;


/**
 * Generated from IDL interface "TCPProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TCPProtocolPropertiesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.RTCORBA.TCPProtocolProperties s)
	{
			any.insert_Object(s);
	}
	public static org.omg.RTCORBA.TCPProtocolProperties extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/RTCORBA/TCPProtocolProperties:1.0", "TCPProtocolProperties");
	}
	public static String id()
	{
		return "IDL:omg.org/RTCORBA/TCPProtocolProperties:1.0";
	}
	public static TCPProtocolProperties read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.RTCORBA.TCPProtocolProperties s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.RTCORBA.TCPProtocolProperties narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.RTCORBA.TCPProtocolProperties)
		{
			return (org.omg.RTCORBA.TCPProtocolProperties)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.RTCORBA.TCPProtocolProperties unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.RTCORBA.TCPProtocolProperties)
		{
			return (org.omg.RTCORBA.TCPProtocolProperties)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
