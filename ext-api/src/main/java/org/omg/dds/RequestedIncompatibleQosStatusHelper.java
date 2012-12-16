package org.omg.dds;


/**
 * Generated from IDL struct "RequestedIncompatibleQosStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class RequestedIncompatibleQosStatusHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.RequestedIncompatibleQosStatusHelper.id(),"RequestedIncompatibleQosStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("total_count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("total_count_change", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("last_policy_id", org.omg.dds.QosPolicyId_tHelper.type(), null),new org.omg.CORBA.StructMember("policies", org.omg.dds.QosPolicyCountSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.RequestedIncompatibleQosStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.RequestedIncompatibleQosStatus extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/RequestedIncompatibleQosStatus:1.0";
	}
	public static org.omg.dds.RequestedIncompatibleQosStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.RequestedIncompatibleQosStatus result = new org.omg.dds.RequestedIncompatibleQosStatus();
		result.total_count=in.read_long();
		result.total_count_change=in.read_long();
		result.last_policy_id=in.read_long();
		result.policies = org.omg.dds.QosPolicyCountSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.RequestedIncompatibleQosStatus s)
	{
		out.write_long(s.total_count);
		out.write_long(s.total_count_change);
		out.write_long(s.last_policy_id);
		org.omg.dds.QosPolicyCountSeqHelper.write(out,s.policies);
	}
}
