package org.omg.dds;


/**
 * Generated from IDL struct "PublisherQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PublisherQosHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.PublisherQosHelper.id(),"PublisherQos",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("presentation", org.omg.dds.PresentationQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("partition", org.omg.dds.PartitionQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("group_data", org.omg.dds.GroupDataQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("entity_factory", org.omg.dds.EntityFactoryQosPolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.PublisherQos s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.PublisherQos extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/PublisherQos:1.0";
	}
	public static org.omg.dds.PublisherQos read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.PublisherQos result = new org.omg.dds.PublisherQos();
		result.presentation=org.omg.dds.PresentationQosPolicyHelper.read(in);
		result.partition=org.omg.dds.PartitionQosPolicyHelper.read(in);
		result.group_data=org.omg.dds.GroupDataQosPolicyHelper.read(in);
		result.entity_factory=org.omg.dds.EntityFactoryQosPolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.PublisherQos s)
	{
		org.omg.dds.PresentationQosPolicyHelper.write(out,s.presentation);
		org.omg.dds.PartitionQosPolicyHelper.write(out,s.partition);
		org.omg.dds.GroupDataQosPolicyHelper.write(out,s.group_data);
		org.omg.dds.EntityFactoryQosPolicyHelper.write(out,s.entity_factory);
	}
}
