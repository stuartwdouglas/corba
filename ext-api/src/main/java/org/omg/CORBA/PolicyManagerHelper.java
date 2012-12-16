package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class PolicyManagerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.PolicyManager s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.PolicyManager extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/PolicyManager:1.0", "PolicyManager");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/PolicyManager:1.0";
	}
	public static PolicyManager read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.PolicyManager s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.CORBA.PolicyManager narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.PolicyManager)
		{
			return (org.omg.CORBA.PolicyManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.PolicyManager unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.PolicyManager)
		{
			return (org.omg.CORBA.PolicyManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
