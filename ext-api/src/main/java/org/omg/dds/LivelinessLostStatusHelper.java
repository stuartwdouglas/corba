package org.omg.dds;


/**
 * Generated from IDL struct "LivelinessLostStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessLostStatusHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.LivelinessLostStatusHelper.id(),"LivelinessLostStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("total_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("total_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.LivelinessLostStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.LivelinessLostStatus extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/LivelinessLostStatus:1.0";
	}
	public static org.omg.dds.LivelinessLostStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.LivelinessLostStatus result = new org.omg.dds.LivelinessLostStatus();
		result.total_count=in.read_long();
		result.total_count_change=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.LivelinessLostStatus s)
	{
		out.write_long(s.total_count);
		out.write_long(s.total_count_change);
	}
}
