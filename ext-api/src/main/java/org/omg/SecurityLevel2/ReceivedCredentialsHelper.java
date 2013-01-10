package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "ReceivedCredentials".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ReceivedCredentialsHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.SecurityLevel2.ReceivedCredentials s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SecurityLevel2.ReceivedCredentials extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SecurityLevel2/ReceivedCredentials:1.0", "ReceivedCredentials");
	}
	public static String id()
	{
		return "IDL:omg.org/SecurityLevel2/ReceivedCredentials:1.0";
	}
	public static ReceivedCredentials read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SecurityLevel2.ReceivedCredentials s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SecurityLevel2.ReceivedCredentials narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityLevel2.ReceivedCredentials)
		{
			return (org.omg.SecurityLevel2.ReceivedCredentials)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SecurityLevel2.ReceivedCredentials unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityLevel2.ReceivedCredentials)
		{
			return (org.omg.SecurityLevel2.ReceivedCredentials)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
