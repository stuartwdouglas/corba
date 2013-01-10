package org.omg.CosTime;


/**
 * Generated from IDL interface "TimeService".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class TimeServiceHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTime.TimeService s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTime.TimeService extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosTime/TimeService:1.0", "TimeService");
	}
	public static String id()
	{
		return "IDL:CosTime/TimeService:1.0";
	}
	public static TimeService read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTime.TimeService s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTime.TimeService narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.TimeService)
		{
			return (org.omg.CosTime.TimeService)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTime.TimeService unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTime.TimeService)
		{
			return (org.omg.CosTime.TimeService)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
