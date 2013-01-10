package org.omg.IIOP;


/**
 * Generated from IDL struct "ListenPoint".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ListenPointHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IIOP.ListenPointHelper.id(),"ListenPoint",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("host", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IIOP.ListenPoint s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IIOP.ListenPoint extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IIOP/ListenPoint:1.0";
	}
	public static org.omg.IIOP.ListenPoint read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IIOP.ListenPoint result = new org.omg.IIOP.ListenPoint();
		result.host=in.read_string();
		result.port=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IIOP.ListenPoint s)
	{
		out.write_string(s.host);
		out.write_ushort(s.port);
	}
}
