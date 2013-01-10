package org.omg.GIOP;


/**
 * Generated from IDL struct "RequestHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RequestHeader_1_2Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.RequestHeader_1_2Helper.id(),"RequestHeader_1_2",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("response_flags", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10)), null),new org.omg.CORBA.StructMember("reserved", org.omg.CORBA.ORB.init().create_array_tc(3,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null),new org.omg.CORBA.StructMember("target", org.omg.GIOP.TargetAddressHelper.type(), null),new org.omg.CORBA.StructMember("operation", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("service_context", org.omg.IOP.ServiceContextListHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.RequestHeader_1_2 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.RequestHeader_1_2 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/RequestHeader_1_2:1.0";
	}
	public static org.omg.GIOP.RequestHeader_1_2 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.RequestHeader_1_2 result = new org.omg.GIOP.RequestHeader_1_2();
		result.request_id=in.read_ulong();
		result.response_flags=in.read_octet();
		result.reserved = new byte[3];
		in.read_octet_array(result.reserved,0,3);
		result.target=org.omg.GIOP.TargetAddressHelper.read(in);
		result.operation=in.read_string();
		result.service_context = org.omg.IOP.ServiceContextListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.RequestHeader_1_2 s)
	{
		out.write_ulong(s.request_id);
		out.write_octet(s.response_flags);
				if (s.reserved.length<3)
			throw new org.omg.CORBA.MARSHAL("Incorrect array size "+s.reserved.length+", expecting 3");
		out.write_octet_array(s.reserved,0,3);
		org.omg.GIOP.TargetAddressHelper.write(out,s.target);
		out.write_string(s.operation);
		org.omg.IOP.ServiceContextListHelper.write(out,s.service_context);
	}
}
