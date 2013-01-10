package org.omg.dds;


/**
 * Generated from IDL struct "TimeBasedFilterQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class TimeBasedFilterQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.TimeBasedFilterQosPolicyHelper.id(),"TimeBasedFilterQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("minimum_separation", org.omg.dds.Duration_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.TimeBasedFilterQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.TimeBasedFilterQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/TimeBasedFilterQosPolicy:1.0";
	}
	public static org.omg.dds.TimeBasedFilterQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.TimeBasedFilterQosPolicy result = new org.omg.dds.TimeBasedFilterQosPolicy();
		result.minimum_separation=org.omg.dds.Duration_tHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.TimeBasedFilterQosPolicy s)
	{
		org.omg.dds.Duration_tHelper.write(out,s.minimum_separation);
	}
}
