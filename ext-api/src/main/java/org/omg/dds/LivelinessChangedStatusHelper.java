package org.omg.dds;


/**
 * Generated from IDL struct "LivelinessChangedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessChangedStatusHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.LivelinessChangedStatusHelper.id(),"LivelinessChangedStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("inactive_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("active_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("inactive_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.LivelinessChangedStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.LivelinessChangedStatus extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/LivelinessChangedStatus:1.0";
	}
	public static org.omg.dds.LivelinessChangedStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.LivelinessChangedStatus result = new org.omg.dds.LivelinessChangedStatus();
		result.active_count=in.read_long();
		result.inactive_count=in.read_long();
		result.active_count_change=in.read_long();
		result.inactive_count_change=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.LivelinessChangedStatus s)
	{
		out.write_long(s.active_count);
		out.write_long(s.inactive_count);
		out.write_long(s.active_count_change);
		out.write_long(s.inactive_count_change);
	}
}
