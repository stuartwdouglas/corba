package org.omg.CSIIOP;


/**
 * Generated from IDL struct "TransportAddress".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class TransportAddressHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.TransportAddressHelper.id(),"TransportAddress",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("host_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.TransportAddress s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.TransportAddress extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/TransportAddress:1.0";
	}
	public static org.omg.CSIIOP.TransportAddress read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.TransportAddress result = new org.omg.CSIIOP.TransportAddress();
		result.host_name=in.read_string();
		result.port=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.TransportAddress s)
	{
		out.write_string(s.host_name);
		out.write_ushort(s.port);
	}
}
