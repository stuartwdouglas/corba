package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ServerRequestInterceptorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.ServerRequestInterceptor s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableInterceptor.ServerRequestInterceptor extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableInterceptor/ServerRequestInterceptor:1.0", "ServerRequestInterceptor");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/ServerRequestInterceptor:1.0";
	}
	public static ServerRequestInterceptor read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableInterceptor.ServerRequestInterceptor s)
	{
		_out.write_Object(s);
	}
	public static org.omg.PortableInterceptor.ServerRequestInterceptor narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ServerRequestInterceptor)
		{
			return (org.omg.PortableInterceptor.ServerRequestInterceptor)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableInterceptor.ServerRequestInterceptor unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.ServerRequestInterceptor)
		{
			return (org.omg.PortableInterceptor.ServerRequestInterceptor)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
