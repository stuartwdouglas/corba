package org.omg.Security;

/**
 * Generated from IDL alias "UtcT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class UtcTHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.TimeBase.UtcT s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.TimeBase.UtcT extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.UtcTHelper.id(), "UtcT",org.omg.TimeBase.UtcTHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Security/UtcT:1.0";
	}
	public static org.omg.TimeBase.UtcT read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.TimeBase.UtcT _result;
		_result=org.omg.TimeBase.UtcTHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.TimeBase.UtcT _s)
	{
		org.omg.TimeBase.UtcTHelper.write(_out,_s);
	}
}
