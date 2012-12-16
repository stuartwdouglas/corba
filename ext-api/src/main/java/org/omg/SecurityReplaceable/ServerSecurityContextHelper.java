package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "ServerSecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class ServerSecurityContextHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.SecurityReplaceable.ServerSecurityContext s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SecurityReplaceable.ServerSecurityContext extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SecurityReplaceable/ServerSecurityContext:1.0", "ServerSecurityContext");
	}
	public static String id()
	{
		return "IDL:omg.org/SecurityReplaceable/ServerSecurityContext:1.0";
	}
	public static ServerSecurityContext read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SecurityReplaceable.ServerSecurityContext s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SecurityReplaceable.ServerSecurityContext narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.ServerSecurityContext)
		{
			return (org.omg.SecurityReplaceable.ServerSecurityContext)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SecurityReplaceable.ServerSecurityContext unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.ServerSecurityContext)
		{
			return (org.omg.SecurityReplaceable.ServerSecurityContext)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
