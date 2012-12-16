package org.omg.dds;


/**
 * Generated from IDL struct "PartitionQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PartitionQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.PartitionQosPolicyHelper.id(),"PartitionQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.dds.StringSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.PartitionQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.PartitionQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/PartitionQosPolicy:1.0";
	}
	public static org.omg.dds.PartitionQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.PartitionQosPolicy result = new org.omg.dds.PartitionQosPolicy();
		result.name = org.omg.dds.StringSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.PartitionQosPolicy s)
	{
		org.omg.dds.StringSeqHelper.write(out,s.name);
	}
}