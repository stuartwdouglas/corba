package org.omg.GIOP;


/**
 * Generated from IDL struct "MessageHeader_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class MessageHeader_1_1Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.MessageHeader_1_1Helper.id(),"MessageHeader_1_1",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("magic", org.omg.CORBA.ORB.init().create_array_tc(4,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(9))), null),new org.omg.CORBA.StructMember("GIOP_version", org.omg.GIOP.VersionHelper.type(), null),new org.omg.CORBA.StructMember("flags", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("message_type", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("message_size", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.MessageHeader_1_1 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.MessageHeader_1_1 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/MessageHeader_1_1:1.0";
	}
	public static org.omg.GIOP.MessageHeader_1_1 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.MessageHeader_1_1 result = new org.omg.GIOP.MessageHeader_1_1();
		result.magic = new char[4];
		in.read_char_array(result.magic,0,4);
		result.GIOP_version=org.omg.GIOP.VersionHelper.read(in);
		result.flags=in.read_octet();
		result.message_type=in.read_octet();
		result.message_size=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.MessageHeader_1_1 s)
	{
				if (s.magic.length<4)
			throw new org.omg.CORBA.MARSHAL("Incorrect array size "+s.magic.length+", expecting 4");
		out.write_char_array(s.magic,0,4);
		org.omg.GIOP.VersionHelper.write(out,s.GIOP_version);
		out.write_octet(s.flags);
		out.write_octet(s.message_type);
		out.write_ulong(s.message_size);
	}
}
