package org.omg.PortableServer;


/**
 * Generated from IDL interface "POAManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class POAManagerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.POAManager s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableServer.POAManager extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableServer/POAManager:1.0", "POAManager");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableServer/POAManager:1.0";
	}
	public static POAManager read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableServer.POAManager s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableServer.POAManager narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.POAManager)
		{
			return (org.omg.PortableServer.POAManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableServer.POAManager unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.POAManager)
		{
			return (org.omg.PortableServer.POAManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
