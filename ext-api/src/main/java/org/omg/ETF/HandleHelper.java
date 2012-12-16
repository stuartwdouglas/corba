package org.omg.ETF;


/**
 * Generated from IDL interface "Handle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class HandleHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.ETF.Handle s)
	{
			any.insert_Object(s);
	}
	public static org.omg.ETF.Handle extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/ETF/Handle:1.0", "Handle");
	}
	public static String id()
	{
		return "IDL:omg.org/ETF/Handle:1.0";
	}
	public static Handle read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.ETF.Handle s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.ETF.Handle narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.ETF.Handle)
		{
			return (org.omg.ETF.Handle)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.ETF.Handle unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.ETF.Handle)
		{
			return (org.omg.ETF.Handle)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
