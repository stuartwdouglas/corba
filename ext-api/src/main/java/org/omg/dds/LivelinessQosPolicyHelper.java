package org.omg.dds;


/**
 * Generated from IDL struct "LivelinessQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class LivelinessQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.LivelinessQosPolicyHelper.id(),"LivelinessQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("kind", org.omg.dds.LivelinessQosPolicyKindHelper.type(), null),new org.omg.CORBA.StructMember("lease_duration", org.omg.dds.Duration_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.LivelinessQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.LivelinessQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/LivelinessQosPolicy:1.0";
	}
	public static org.omg.dds.LivelinessQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.LivelinessQosPolicy result = new org.omg.dds.LivelinessQosPolicy();
		result.kind=org.omg.dds.LivelinessQosPolicyKindHelper.read(in);
		result.lease_duration=org.omg.dds.Duration_tHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.LivelinessQosPolicy s)
	{
		org.omg.dds.LivelinessQosPolicyKindHelper.write(out,s.kind);
		org.omg.dds.Duration_tHelper.write(out,s.lease_duration);
	}
}
