package org.omg.Security;

/**
 * Generated from IDL alias "IntervalT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class IntervalTHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.TimeBase.IntervalT s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.TimeBase.IntervalT extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.IntervalTHelper.id(), "IntervalT",org.omg.TimeBase.IntervalTHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Security/IntervalT:1.0";
	}
	public static org.omg.TimeBase.IntervalT read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.TimeBase.IntervalT _result;
		_result=org.omg.TimeBase.IntervalTHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.TimeBase.IntervalT _s)
	{
		org.omg.TimeBase.IntervalTHelper.write(_out,_s);
	}
}
