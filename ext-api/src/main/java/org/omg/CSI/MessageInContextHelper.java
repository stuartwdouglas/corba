package org.omg.CSI;


/**
 * Generated from IDL struct "MessageInContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class MessageInContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSI.MessageInContextHelper.id(),"MessageInContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("client_context_id", org.omg.CSI.ContextIdHelper.type(), null),new org.omg.CORBA.StructMember("discard_context", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.MessageInContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.MessageInContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/MessageInContext:1.0";
	}
	public static org.omg.CSI.MessageInContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSI.MessageInContext result = new org.omg.CSI.MessageInContext();
		result.client_context_id=in.read_ulonglong();
		result.discard_context=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSI.MessageInContext s)
	{
		out.write_ulonglong(s.client_context_id);
		out.write_boolean(s.discard_context);
	}
}
