package org.omg.CosNotification;

/**
 * Generated from IDL alias "PropertyName".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class PropertyNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, java.lang.String s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static java.lang.String extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.PropertyNameHelper.id(), "PropertyName",org.omg.CosNotification.IstringHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/PropertyName:1.0";
	}
	public static java.lang.String read (final org.omg.CORBA.portable.InputStream _in)
	{
		java.lang.String _result;
		_result=_in.read_string();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, java.lang.String _s)
	{
		_out.write_string(_s);
	}
}
