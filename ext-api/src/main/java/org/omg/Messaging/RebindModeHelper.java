package org.omg.Messaging;

/**
 * Generated from IDL alias "RebindMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RebindModeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, short s)
	{
		any.insert_short(s);
	}

	public static short extract (final org.omg.CORBA.Any any)
	{
		return any.extract_short();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Messaging.RebindModeHelper.id(), "RebindMode",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Messaging/RebindMode:1.0";
	}
	public static short read (final org.omg.CORBA.portable.InputStream _in)
	{
		short _result;
		_result=_in.read_short();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, short _s)
	{
		_out.write_short(_s);
	}
}
