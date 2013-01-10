package org.omg.dds;

/**
 * Generated from IDL struct "DataReaderQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DataReaderQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public DataReaderQos(){}
	public org.omg.dds.DurabilityQosPolicy durability;
	public org.omg.dds.DeadlineQosPolicy deadline;
	public org.omg.dds.LatencyBudgetQosPolicy latency_budget;
	public org.omg.dds.LivelinessQosPolicy liveliness;
	public org.omg.dds.ReliabilityQosPolicy reliability;
	public org.omg.dds.DestinationOrderQosPolicy destination_order;
	public org.omg.dds.HistoryQosPolicy history;
	public org.omg.dds.ResourceLimitsQosPolicy resource_limits;
	public org.omg.dds.UserDataQosPolicy user_data;
	public org.omg.dds.TimeBasedFilterQosPolicy time_based_filter;
	public org.omg.dds.ReaderDataLifecycleQosPolicy reader_data_lifecycle;
	public DataReaderQos(org.omg.dds.DurabilityQosPolicy durability, org.omg.dds.DeadlineQosPolicy deadline, org.omg.dds.LatencyBudgetQosPolicy latency_budget, org.omg.dds.LivelinessQosPolicy liveliness, org.omg.dds.ReliabilityQosPolicy reliability, org.omg.dds.DestinationOrderQosPolicy destination_order, org.omg.dds.HistoryQosPolicy history, org.omg.dds.ResourceLimitsQosPolicy resource_limits, org.omg.dds.UserDataQosPolicy user_data, org.omg.dds.TimeBasedFilterQosPolicy time_based_filter, org.omg.dds.ReaderDataLifecycleQosPolicy reader_data_lifecycle)
	{
		this.durability = durability;
		this.deadline = deadline;
		this.latency_budget = latency_budget;
		this.liveliness = liveliness;
		this.reliability = reliability;
		this.destination_order = destination_order;
		this.history = history;
		this.resource_limits = resource_limits;
		this.user_data = user_data;
		this.time_based_filter = time_based_filter;
		this.reader_data_lifecycle = reader_data_lifecycle;
	}
}
