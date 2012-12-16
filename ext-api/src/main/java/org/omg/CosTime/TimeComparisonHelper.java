package org.omg.CosTime;
/**
 * Generated from IDL enum "TimeComparison".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class TimeComparisonHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosTime.TimeComparisonHelper.id(),"TimeComparison",new String[]{"TCEqualTo","TCLessThan","TCGreaterThan","TCIndeterminate"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTime.TimeComparison s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTime.TimeComparison extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:CosTime/TimeComparison:1.0";
	}
	public static TimeComparison read (final org.omg.CORBA.portable.InputStream in)
	{
		return TimeComparison.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TimeComparison s)
	{
		out.write_long(s.value());
	}
}
