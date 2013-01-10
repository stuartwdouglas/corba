package org.omg.GIOP;

/**
 * Generated from IDL alias "MessageHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class MessageHeader_1_2Helper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.GIOP.MessageHeader_1_1 s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.GIOP.MessageHeader_1_1 extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.MessageHeader_1_2Helper.id(), "MessageHeader_1_2",org.omg.GIOP.MessageHeader_1_1Helper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/MessageHeader_1_2:1.0";
	}
	public static org.omg.GIOP.MessageHeader_1_1 read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.GIOP.MessageHeader_1_1 _result;
		_result=org.omg.GIOP.MessageHeader_1_1Helper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.GIOP.MessageHeader_1_1 _s)
	{
		org.omg.GIOP.MessageHeader_1_1Helper.write(_out,_s);
	}
}
