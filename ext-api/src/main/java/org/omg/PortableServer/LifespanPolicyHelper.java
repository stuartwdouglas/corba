package org.omg.PortableServer;


/**
 * Generated from IDL interface "LifespanPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class LifespanPolicyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.LifespanPolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.PortableServer.LifespanPolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/PortableServer/LifespanPolicy:1.0", "LifespanPolicy");
	}
	public static String id()
	{
		return "IDL:omg.org/PortableServer/LifespanPolicy:1.0";
	}
	public static LifespanPolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.PortableServer.LifespanPolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.PortableServer.LifespanPolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.LifespanPolicy)
		{
			return (org.omg.PortableServer.LifespanPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.PortableServer.LifespanPolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.PortableServer.LifespanPolicy)
		{
			return (org.omg.PortableServer.LifespanPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
