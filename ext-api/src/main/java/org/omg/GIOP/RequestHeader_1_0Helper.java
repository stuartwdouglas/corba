package org.omg.GIOP;


/**
 * Generated from IDL struct "RequestHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RequestHeader_1_0Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.RequestHeader_1_0Helper.id(),"RequestHeader_1_0",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("service_context", org.omg.IOP.ServiceContextListHelper.type(), null),new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("response_expected", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("object_key", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null),new org.omg.CORBA.StructMember("operation", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("requesting_principal", org.omg.CORBA.PrincipalHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.RequestHeader_1_0 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.RequestHeader_1_0 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/RequestHeader_1_0:1.0";
	}
	public static org.omg.GIOP.RequestHeader_1_0 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.RequestHeader_1_0 result = new org.omg.GIOP.RequestHeader_1_0();
		result.service_context = org.omg.IOP.ServiceContextListHelper.read(in);
		result.request_id=in.read_ulong();
		result.response_expected=in.read_boolean();
		int _lresult_object_key55 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_object_key55 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_object_key55);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.object_key = new byte[_lresult_object_key55];
		in.read_octet_array(result.object_key,0,_lresult_object_key55);
		result.operation=in.read_string();
		result.requesting_principal = org.omg.CORBA.PrincipalHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.RequestHeader_1_0 s)
	{
		org.omg.IOP.ServiceContextListHelper.write(out,s.service_context);
		out.write_ulong(s.request_id);
		out.write_boolean(s.response_expected);
		
		out.write_long(s.object_key.length);
		out.write_octet_array(s.object_key,0,s.object_key.length);
		out.write_string(s.operation);
		org.omg.CORBA.PrincipalHelper.write(out,s.requesting_principal);
	}
}
