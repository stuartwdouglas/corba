package org.omg.ATLAS;

/**
 * Generated from IDL alias "ATLASLocatorType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ATLASLocatorTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, int s)
	{
		any.insert_ulong(s);
	}

	public static int extract (final org.omg.CORBA.Any any)
	{
		return any.extract_ulong();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.ATLAS.ATLASLocatorTypeHelper.id(), "ATLASLocatorType",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/ATLASLocatorType:1.0";
	}
	public static int read (final org.omg.CORBA.portable.InputStream _in)
	{
		int _result;
		_result=_in.read_ulong();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int _s)
	{
		_out.write_ulong(_s);
	}
}
