package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "CallbackID".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class CallbackIDHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, int s)
	{
		any.insert_long(s);
	}

	public static int extract (final org.omg.CORBA.Any any)
	{
		return any.extract_long();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotifyFilter.CallbackIDHelper.id(), "CallbackID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/CallbackID:1.0";
	}
	public static int read (final org.omg.CORBA.portable.InputStream _in)
	{
		int _result;
		_result=_in.read_long();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int _s)
	{
		_out.write_long(_s);
	}
}
