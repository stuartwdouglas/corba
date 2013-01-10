package org.omg.dds;


/**
 * Generated from IDL struct "SampleInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.SampleInfoHelper.id(),"SampleInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sample_state", org.omg.dds.SampleStateKindHelper.type(), null),new org.omg.CORBA.StructMember("view_state", org.omg.dds.ViewStateKindHelper.type(), null),new org.omg.CORBA.StructMember("instance_state", org.omg.dds.InstanceStateKindHelper.type(), null),new org.omg.CORBA.StructMember("source_timestamp", org.omg.dds.Time_tHelper.type(), null),new org.omg.CORBA.StructMember("instance_handle", org.omg.dds.InstanceHandle_tHelper.type(), null),new org.omg.CORBA.StructMember("disposed_generation_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("no_writers_generation_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("sample_rank", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("generation_rank", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("absolute_generation_rank", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.SampleInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.SampleInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/SampleInfo:1.0";
	}
	public static org.omg.dds.SampleInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.SampleInfo result = new org.omg.dds.SampleInfo();
		result.sample_state=in.read_ulong();
		result.view_state=in.read_ulong();
		result.instance_state=in.read_ulong();
		result.source_timestamp=org.omg.dds.Time_tHelper.read(in);
		result.instance_handle=in.read_long();
		result.disposed_generation_count=in.read_long();
		result.no_writers_generation_count=in.read_long();
		result.sample_rank=in.read_long();
		result.generation_rank=in.read_long();
		result.absolute_generation_rank=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.SampleInfo s)
	{
		out.write_ulong(s.sample_state);
		out.write_ulong(s.view_state);
		out.write_ulong(s.instance_state);
		org.omg.dds.Time_tHelper.write(out,s.source_timestamp);
		out.write_long(s.instance_handle);
		out.write_long(s.disposed_generation_count);
		out.write_long(s.no_writers_generation_count);
		out.write_long(s.sample_rank);
		out.write_long(s.generation_rank);
		out.write_long(s.absolute_generation_rank);
	}
}
