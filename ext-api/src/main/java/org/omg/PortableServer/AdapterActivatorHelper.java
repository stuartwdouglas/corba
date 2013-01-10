package org.omg.PortableServer;


/**
 * Generated from IDL interface "AdapterActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class AdapterActivatorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.AdapterActivator s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableServer.AdapterActivator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableServer/AdapterActivator:1.0", "AdapterActivator");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableServer/AdapterActivator:1.0";
	}
	public static AdapterActivator read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableServer.AdapterActivator s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableServer.AdapterActivator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.AdapterActivator)
		{
			return (org.omg.PortableServer.AdapterActivator)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableServer.AdapterActivator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.AdapterActivator)
		{
			return (org.omg.PortableServer.AdapterActivator)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
