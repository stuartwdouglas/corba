package org.omg.CSI;


/**
 * Generated from IDL struct "ContextError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class ContextErrorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSI.ContextErrorHelper.id(),"ContextError",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("client_context_id", org.omg.CSI.ContextIdHelper.type(), null),new org.omg.CORBA.StructMember("major_status", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("minor_status", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("error_token", org.omg.CSI.GSSTokenHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.ContextError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.ContextError extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/ContextError:1.0";
	}
	public static org.omg.CSI.ContextError read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSI.ContextError result = new org.omg.CSI.ContextError();
		result.client_context_id=in.read_ulonglong();
		result.major_status=in.read_long();
		result.minor_status=in.read_long();
		result.error_token = org.omg.CSI.GSSTokenHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSI.ContextError s)
	{
		out.write_ulonglong(s.client_context_id);
		out.write_long(s.major_status);
		out.write_long(s.minor_status);
		org.omg.CSI.GSSTokenHelper.write(out,s.error_token);
	}
}
