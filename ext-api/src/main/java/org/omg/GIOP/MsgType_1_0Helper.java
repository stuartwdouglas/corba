package org.omg.GIOP;
/**
 * Generated from IDL enum "MsgType_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class MsgType_1_0Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.GIOP.MsgType_1_0Helper.id(),"MsgType_1_0",new String[]{"Request","Reply","CancelRequest","LocateRequest","LocateReply","CloseConnection","MessageError"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.MsgType_1_0 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.MsgType_1_0 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/MsgType_1_0:1.0";
	}
	public static MsgType_1_0 read (final org.omg.CORBA.portable.InputStream in)
	{
		return MsgType_1_0.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final MsgType_1_0 s)
	{
		out.write_long(s.value());
	}
}
