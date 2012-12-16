package org.omg.GIOP;


/**
 * Generated from IDL struct "CancelRequestHeader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CancelRequestHeaderHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.GIOP.CancelRequestHeaderHelper.id(),"CancelRequestHeader",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("request_id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.GIOP.CancelRequestHeader s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.GIOP.CancelRequestHeader extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/CancelRequestHeader:1.0";
	}
	public static org.omg.GIOP.CancelRequestHeader read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.GIOP.CancelRequestHeader result = new org.omg.GIOP.CancelRequestHeader();
		result.request_id=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.GIOP.CancelRequestHeader s)
	{
		out.write_ulong(s.request_id);
	}
}
