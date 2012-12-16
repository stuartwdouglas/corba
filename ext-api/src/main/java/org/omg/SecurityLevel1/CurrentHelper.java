package org.omg.SecurityLevel1;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CurrentHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.SecurityLevel1.Current s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SecurityLevel1.Current extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SecurityLevel1/Current:1.0", "Current");
	}
	public static String id()
	{
		return "IDL:omg.org/SecurityLevel1/Current:1.0";
	}
	public static Current read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SecurityLevel1.Current s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SecurityLevel1.Current narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityLevel1.Current)
		{
			return (org.omg.SecurityLevel1.Current)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SecurityLevel1.Current unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityLevel1.Current)
		{
			return (org.omg.SecurityLevel1.Current)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
