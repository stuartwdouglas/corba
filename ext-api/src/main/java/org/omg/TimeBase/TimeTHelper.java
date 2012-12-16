package org.omg.TimeBase;

/**
 * Generated from IDL alias "TimeT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class TimeTHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, long s)
	{
		any.insert_ulonglong(s);
	}

	public static long extract (final org.omg.CORBA.Any any)
	{
		return any.extract_ulonglong();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.TimeBase.TimeTHelper.id(), "TimeT",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(24)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/TimeBase/TimeT:1.0";
	}
	public static long read (final org.omg.CORBA.portable.InputStream _in)
	{
		long _result;
		_result=_in.read_ulonglong();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, long _s)
	{
		_out.write_ulonglong(_s);
	}
}
