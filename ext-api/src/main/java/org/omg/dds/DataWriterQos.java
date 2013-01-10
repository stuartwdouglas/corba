package org.omg.dds;

/**
 * Generated from IDL struct "DataWriterQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DataWriterQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public DataWriterQos(){}
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
	public org.omg.dds.UserDataQosPolicy user_data;
	public org.omg.dds.OwnershipStrengthQosPolicy ownership_strength;
	public org.omg.dds.WriterDataLifecycleQosPolicy writer_data_lifecycle;
	public DataWriterQos(org.omg.dds.DurabilityQosPolicy durability, org.omg.dds.DeadlineQosPolicy deadline, org.omg.dds.LatencyBudgetQosPolicy latency_budget, org.omg.dds.LivelinessQosPolicy liveliness, org.omg.dds.ReliabilityQosPolicy reliability, org.omg.dds.DestinationOrderQosPolicy destination_order, org.omg.dds.HistoryQosPolicy history, org.omg.dds.ResourceLimitsQosPolicy resource_limits, org.omg.dds.TransportPriorityQosPolicy transport_priority, org.omg.dds.LifespanQosPolicy lifespan, org.omg.dds.UserDataQosPolicy user_data, org.omg.dds.OwnershipStrengthQosPolicy ownership_strength, org.omg.dds.WriterDataLifecycleQosPolicy writer_data_lifecycle)
	{
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
		this.user_data = user_data;
		this.ownership_strength = ownership_strength;
		this.writer_data_lifecycle = writer_data_lifecycle;
	}
}
