package org.omg.Security;
/**
 * Generated from IDL enum "DayOfTheWeek".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DayOfTheWeekHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.DayOfTheWeekHelper.id(),"DayOfTheWeek",new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.DayOfTheWeek s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.DayOfTheWeek extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/DayOfTheWeek:1.0";
	}
	public static DayOfTheWeek read (final org.omg.CORBA.portable.InputStream in)
	{
		return DayOfTheWeek.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final DayOfTheWeek s)
	{
		out.write_long(s.value());
	}
}
