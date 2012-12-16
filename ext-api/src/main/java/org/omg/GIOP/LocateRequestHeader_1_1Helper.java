package org.omg.GIOP;

/**
 * Generated from IDL alias "LocateRequestHeader_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class LocateRequestHeader_1_1Helper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.GIOP.LocateRequestHeader_1_0 s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.GIOP.LocateRequestHeader_1_0 extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.LocateRequestHeader_1_1Helper.id(), "LocateRequestHeader_1_1",org.omg.GIOP.LocateRequestHeader_1_0Helper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/LocateRequestHeader_1_1:1.0";
	}
	public static org.omg.GIOP.LocateRequestHeader_1_0 read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.GIOP.LocateRequestHeader_1_0 _result;
		_result=org.omg.GIOP.LocateRequestHeader_1_0Helper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.GIOP.LocateRequestHeader_1_0 _s)
	{
		org.omg.GIOP.LocateRequestHeader_1_0Helper.write(_out,_s);
	}
}
