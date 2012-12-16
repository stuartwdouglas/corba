package org.omg.dds;


/**
 * Generated from IDL struct "WriterDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class WriterDataLifecycleQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.WriterDataLifecycleQosPolicyHelper.id(),"WriterDataLifecycleQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("autodispose_unregistered_instances", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.WriterDataLifecycleQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.WriterDataLifecycleQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/WriterDataLifecycleQosPolicy:1.0";
	}
	public static org.omg.dds.WriterDataLifecycleQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.WriterDataLifecycleQosPolicy result = new org.omg.dds.WriterDataLifecycleQosPolicy();
		result.autodispose_unregistered_instances=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.WriterDataLifecycleQosPolicy s)
	{
		out.write_boolean(s.autodispose_unregistered_instances);
	}
}
