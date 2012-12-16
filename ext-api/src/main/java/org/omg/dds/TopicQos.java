package org.omg.dds;

/**
 * Generated from IDL struct "TopicQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class TopicQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopicQos(){}
	public org.omg.dds.TopicDataQosPolicy topic_data;
	public org.omg.dds.DurabilityQosPolicy durability;
	public org.omg.dds.DeadlineQosPolicy deadline;
	public org.omg.dds.LatencyBudgetQosPolicy latency_budget;
	public org.omg.dds.LivelinessQosPolicy liveliness;
	public org.omg.dds.ReliabilityQosPolicy reliability;
	public org.omg.dds.DestinationOrderQosPolicy destination_order;
	public org.omg.dds.HistoryQosPolicy history;
	public org.omg.dds.ResourceLimitsQosPolicy resource_limits;
	public org.omg.dds.TransportPriorityQosPolicy transport_priority;
	public org.omg.dds.LifespanQosPolicy lifespan;
	public org.omg.dds.OwnershipQosPolicy ownership;
	public TopicQos(org.omg.dds.TopicDataQosPolicy topic_data, org.omg.dds.DurabilityQosPolicy durability, org.omg.dds.DeadlineQosPolicy deadline, org.omg.dds.LatencyBudgetQosPolicy latency_budget, org.omg.dds.LivelinessQosPolicy liveliness, org.omg.dds.ReliabilityQosPolicy reliability, org.omg.dds.DestinationOrderQosPolicy destination_order, org.omg.dds.HistoryQosPolicy history, org.omg.dds.ResourceLimitsQosPolicy resource_limits, org.omg.dds.TransportPriorityQosPolicy transport_priority, org.omg.dds.LifespanQosPolicy lifespan, org.omg.dds.OwnershipQosPolicy ownership)
	{
		this.topic_data = topic_data;
		this.durability = durability;
		this.deadline = deadline;
		this.latency_budget = latency_budget;
		this.liveliness = liveliness;
		this.reliability = reliability;
		this.destination_order = destination_order;
		this.history = history;
		this.resource_limits = resource_limits;
		this.transport_priority = transport_priority;
		this.lifespan = lifespan;
		this.ownership = ownership;
	}
}
