package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "Interceptor".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class InterceptorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.Interceptor s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableInterceptor.Interceptor extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableInterceptor/Interceptor:1.0", "Interceptor");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/Interceptor:1.0";
	}
	public static Interceptor read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableInterceptor.Interceptor s)
	{
		_out.write_Object(s);
	}
	public static org.omg.PortableInterceptor.Interceptor narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.Interceptor)
		{
			return (org.omg.PortableInterceptor.Interceptor)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableInterceptor.Interceptor unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableInterceptor.Interceptor)
		{
			return (org.omg.PortableInterceptor.Interceptor)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
