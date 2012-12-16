package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ProtocolProperties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ProtocolPropertiesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.RTCORBA.ProtocolProperties s)
	{
			any.insert_Object(s);
	}
	public static org.omg.RTCORBA.ProtocolProperties extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/RTCORBA/ProtocolProperties:1.0", "ProtocolProperties");
	}
	public static String id()
	{
		return "IDL:omg.org/RTCORBA/ProtocolProperties:1.0";
	}
	public static ProtocolProperties read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.RTCORBA.ProtocolProperties s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.RTCORBA.ProtocolProperties narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.RTCORBA.ProtocolProperties)
		{
			return (org.omg.RTCORBA.ProtocolProperties)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.RTCORBA.ProtocolProperties unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.RTCORBA.ProtocolProperties)
		{
			return (org.omg.RTCORBA.ProtocolProperties)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
