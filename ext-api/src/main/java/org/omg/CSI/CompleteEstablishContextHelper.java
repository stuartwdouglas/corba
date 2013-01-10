package org.omg.CSI;


/**
 * Generated from IDL struct "CompleteEstablishContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CompleteEstablishContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSI.CompleteEstablishContextHelper.id(),"CompleteEstablishContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("client_context_id", org.omg.CSI.ContextIdHelper.type(), null),new org.omg.CORBA.StructMember("context_stateful", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("final_context_token", org.omg.CSI.GSSTokenHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.CompleteEstablishContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.CompleteEstablishContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/CompleteEstablishContext:1.0";
	}
	public static org.omg.CSI.CompleteEstablishContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSI.CompleteEstablishContext result = new org.omg.CSI.CompleteEstablishContext();
		result.client_context_id=in.read_ulonglong();
		result.context_stateful=in.read_boolean();
		result.final_context_token = org.omg.CSI.GSSTokenHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSI.CompleteEstablishContext s)
	{
		out.write_ulonglong(s.client_context_id);
		out.write_boolean(s.context_stateful);
		org.omg.CSI.GSSTokenHelper.write(out,s.final_context_token);
	}
}
