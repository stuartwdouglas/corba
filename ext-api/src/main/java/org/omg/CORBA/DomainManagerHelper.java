package org.omg.CORBA;


/**
 * Generated from IDL interface "DomainManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class DomainManagerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.DomainManager s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.DomainManager extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/DomainManager:1.0", "DomainManager");
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/DomainManager:1.0";
	}
	public static DomainManager read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.DomainManager s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.CORBA.DomainManager narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.DomainManager)
		{
			return (org.omg.CORBA.DomainManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.DomainManager unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.DomainManager)
		{
			return (org.omg.CORBA.DomainManager)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
