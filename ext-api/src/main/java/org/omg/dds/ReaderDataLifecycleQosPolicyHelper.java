package org.omg.dds;


/**
 * Generated from IDL struct "ReaderDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ReaderDataLifecycleQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.ReaderDataLifecycleQosPolicyHelper.id(),"ReaderDataLifecycleQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("autopurge_nowriter_samples_delay", org.omg.dds.Duration_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.ReaderDataLifecycleQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.ReaderDataLifecycleQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/ReaderDataLifecycleQosPolicy:1.0";
	}
	public static org.omg.dds.ReaderDataLifecycleQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.ReaderDataLifecycleQosPolicy result = new org.omg.dds.ReaderDataLifecycleQosPolicy();
		result.autopurge_nowriter_samples_delay=org.omg.dds.Duration_tHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.ReaderDataLifecycleQosPolicy s)
	{
		org.omg.dds.Duration_tHelper.write(out,s.autopurge_nowriter_samples_delay);
	}
}
