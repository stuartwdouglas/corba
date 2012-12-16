package org.omg.PortableServer;


/**
 * Generated from IDL interface "ThreadPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ThreadPolicyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.ThreadPolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableServer.ThreadPolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableServer/ThreadPolicy:1.0", "ThreadPolicy");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableServer/ThreadPolicy:1.0";
	}
	public static ThreadPolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableServer.ThreadPolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableServer.ThreadPolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.ThreadPolicy)
		{
			return (org.omg.PortableServer.ThreadPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableServer.ThreadPolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.ThreadPolicy)
		{
			return (org.omg.PortableServer.ThreadPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
