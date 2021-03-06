package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "SecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecurityContextHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.SecurityReplaceable.SecurityContext s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SecurityReplaceable.SecurityContext extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SecurityReplaceable/SecurityContext:1.0", "SecurityContext");
	}
	public static String id()
	{
		return "IDL:omg.org/SecurityReplaceable/SecurityContext:1.0";
	}
	public static SecurityContext read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SecurityReplaceable.SecurityContext s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SecurityReplaceable.SecurityContext narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.SecurityContext)
		{
			return (org.omg.SecurityReplaceable.SecurityContext)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SecurityReplaceable.SecurityContext unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.SecurityContext)
		{
			return (org.omg.SecurityReplaceable.SecurityContext)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
