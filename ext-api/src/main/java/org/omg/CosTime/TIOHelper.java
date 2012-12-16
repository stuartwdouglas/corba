package org.omg.CosTime;


/**
 * Generated from IDL interface "TIO".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class TIOHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTime.TIO s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTime.TIO extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosTime/TIO:1.0", "TIO");
	}
	public static String id()
	{
		return "IDL:CosTime/TIO:1.0";
	}
	public static TIO read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTime.TIO s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTime.TIO narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.TIO)
		{
			return (org.omg.CosTime.TIO)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTime.TIO unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.TIO)
		{
			return (org.omg.CosTime.TIO)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
