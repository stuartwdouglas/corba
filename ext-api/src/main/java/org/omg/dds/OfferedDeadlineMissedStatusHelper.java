package org.omg.dds;


/**
 * Generated from IDL struct "OfferedDeadlineMissedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class OfferedDeadlineMissedStatusHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.OfferedDeadlineMissedStatusHelper.id(),"OfferedDeadlineMissedStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("total_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("total_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("last_instance_handle", org.omg.dds.InstanceHandle_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.OfferedDeadlineMissedStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.OfferedDeadlineMissedStatus extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/OfferedDeadlineMissedStatus:1.0";
	}
	public static org.omg.dds.OfferedDeadlineMissedStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.OfferedDeadlineMissedStatus result = new org.omg.dds.OfferedDeadlineMissedStatus();
		result.total_count=in.read_long();
		result.total_count_change=in.read_long();
		result.last_instance_handle=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.OfferedDeadlineMissedStatus s)
	{
		out.write_long(s.total_count);
		out.write_long(s.total_count_change);
		out.write_long(s.last_instance_handle);
	}
}
