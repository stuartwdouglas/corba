package org.omg.dds;


/**
 * Generated from IDL struct "DurabilityQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DurabilityQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.DurabilityQosPolicyHelper.id(),"DurabilityQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("kind", org.omg.dds.DurabilityQosPolicyKindHelper.type(), null),new org.omg.CORBA.StructMember("service_cleanup_delay", org.omg.dds.Duration_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DurabilityQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.DurabilityQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/DurabilityQosPolicy:1.0";
	}
	public static org.omg.dds.DurabilityQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.DurabilityQosPolicy result = new org.omg.dds.DurabilityQosPolicy();
		result.kind=org.omg.dds.DurabilityQosPolicyKindHelper.read(in);
		result.service_cleanup_delay=org.omg.dds.Duration_tHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.DurabilityQosPolicy s)
	{
		org.omg.dds.DurabilityQosPolicyKindHelper.write(out,s.kind);
		org.omg.dds.Duration_tHelper.write(out,s.service_cleanup_delay);
	}
}
