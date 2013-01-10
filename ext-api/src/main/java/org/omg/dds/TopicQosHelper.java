package org.omg.dds;


/**
 * Generated from IDL struct "TopicQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class TopicQosHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.TopicQosHelper.id(),"TopicQos",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("topic_data", org.omg.dds.TopicDataQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("durability", org.omg.dds.DurabilityQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("deadline", org.omg.dds.DeadlineQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("latency_budget", org.omg.dds.LatencyBudgetQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("liveliness", org.omg.dds.LivelinessQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("reliability", org.omg.dds.ReliabilityQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("destination_order", org.omg.dds.DestinationOrderQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("history", org.omg.dds.HistoryQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("resource_limits", org.omg.dds.ResourceLimitsQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("transport_priority", org.omg.dds.TransportPriorityQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("lifespan", org.omg.dds.LifespanQosPolicyHelper.type(), null),new org.omg.CORBA.StructMember("ownership", org.omg.dds.OwnershipQosPolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.TopicQos s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.TopicQos extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/TopicQos:1.0";
	}
	public static org.omg.dds.TopicQos read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.TopicQos result = new org.omg.dds.TopicQos();
		result.topic_data=org.omg.dds.TopicDataQosPolicyHelper.read(in);
		result.durability=org.omg.dds.DurabilityQosPolicyHelper.read(in);
		result.deadline=org.omg.dds.DeadlineQosPolicyHelper.read(in);
		result.latency_budget=org.omg.dds.LatencyBudgetQosPolicyHelper.read(in);
		result.liveliness=org.omg.dds.LivelinessQosPolicyHelper.read(in);
		result.reliability=org.omg.dds.ReliabilityQosPolicyHelper.read(in);
		result.destination_order=org.omg.dds.DestinationOrderQosPolicyHelper.read(in);
		result.history=org.omg.dds.HistoryQosPolicyHelper.read(in);
		result.resource_limits=org.omg.dds.ResourceLimitsQosPolicyHelper.read(in);
		result.transport_priority=org.omg.dds.TransportPriorityQosPolicyHelper.read(in);
		result.lifespan=org.omg.dds.LifespanQosPolicyHelper.read(in);
		result.ownership=org.omg.dds.OwnershipQosPolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.TopicQos s)
	{
		org.omg.dds.TopicDataQosPolicyHelper.write(out,s.topic_data);
		org.omg.dds.DurabilityQosPolicyHelper.write(out,s.durability);
		org.omg.dds.DeadlineQosPolicyHelper.write(out,s.deadline);
		org.omg.dds.LatencyBudgetQosPolicyHelper.write(out,s.latency_budget);
		org.omg.dds.LivelinessQosPolicyHelper.write(out,s.liveliness);
		org.omg.dds.ReliabilityQosPolicyHelper.write(out,s.reliability);
		org.omg.dds.DestinationOrderQosPolicyHelper.write(out,s.destination_order);
		org.omg.dds.HistoryQosPolicyHelper.write(out,s.history);
		org.omg.dds.ResourceLimitsQosPolicyHelper.write(out,s.resource_limits);
		org.omg.dds.TransportPriorityQosPolicyHelper.write(out,s.transport_priority);
		org.omg.dds.LifespanQosPolicyHelper.write(out,s.lifespan);
		org.omg.dds.OwnershipQosPolicyHelper.write(out,s.ownership);
	}
}
