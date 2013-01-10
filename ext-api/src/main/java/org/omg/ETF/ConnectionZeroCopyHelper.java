package org.omg.ETF;


/**
 * Generated from IDL interface "ConnectionZeroCopy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ConnectionZeroCopyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.ETF.ConnectionZeroCopy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.ETF.ConnectionZeroCopy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/ETF/ConnectionZeroCopy:1.0", "ConnectionZeroCopy");
	}
	public static String id()
	{
		return "IDL:omg.org/ETF/ConnectionZeroCopy:1.0";
	}
	public static ConnectionZeroCopy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.ETF.ConnectionZeroCopy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.ETF.ConnectionZeroCopy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.ETF.ConnectionZeroCopy)
		{
			return (org.omg.ETF.ConnectionZeroCopy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.ETF.ConnectionZeroCopy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.ETF.ConnectionZeroCopy)
		{
			return (org.omg.ETF.ConnectionZeroCopy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
