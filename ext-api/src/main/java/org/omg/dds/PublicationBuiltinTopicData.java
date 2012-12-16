package org.omg.dds;

/**
 * Generated from IDL struct "PublicationBuiltinTopicData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PublicationBuiltinTopicData
	implements org.omg.CORBA.portable.IDLEntity
{
	public PublicationBuiltinTopicData(){}
	public int[] key;
	public int[] participant_key;
	public java.lang.String topic_name = "";
	public java.lang.String type_name = "";
	public org.omg.dds.DurabilityQosPolicy durability;
	public org.omg.dds.DeadlineQosPolicy deadline;
	public org.omg.dds.LatencyBudgetQosPolicy latency_budget;
	public org.omg.dds.LivelinessQosPolicy liveliness;
	public org.omg.dds.ReliabilityQosPolicy reliability;
	public org.omg.dds.LifespanQosPolicy lifespan;
	public org.omg.dds.UserDataQosPolicy user_data;
	public org.omg.dds.OwnershipStrengthQosPolicy ownership_strength;
	public org.omg.dds.PresentationQosPolicy presentation;
	public org.omg.dds.PartitionQosPolicy partition;
	public org.omg.dds.TopicDataQosPolicy topic_data;
	public org.omg.dds.GroupDataQosPolicy group_data;
	public PublicationBuiltinTopicData(int[] key, int[] participant_key, java.lang.String topic_name, java.lang.String type_name, org.omg.dds.DurabilityQosPolicy durability, org.omg.dds.DeadlineQosPolicy deadline, org.omg.dds.LatencyBudgetQosPolicy latency_budget, org.omg.dds.LivelinessQosPolicy liveliness, org.omg.dds.ReliabilityQosPolicy reliability, org.omg.dds.LifespanQosPolicy lifespan, org.omg.dds.UserDataQosPolicy user_data, org.omg.dds.OwnershipStrengthQosPolicy ownership_strength, org.omg.dds.PresentationQosPolicy presentation, org.omg.dds.PartitionQosPolicy partition, org.omg.dds.TopicDataQosPolicy topic_data, org.omg.dds.GroupDataQosPolicy group_data)
	{
		this.key = key;
		this.participant_key = participant_key;
		this.topic_name = topic_name;
		this.type_name = type_name;
		this.durability = durability;
		this.deadline = deadline;
		this.latency_budget = latency_budget;
		this.liveliness = liveliness;
		this.reliability = reliability;
		this.lifespan = lifespan;
		this.user_data = user_data;
		this.ownership_strength = ownership_strength;
		this.presentation = presentation;
		this.partition = partition;
		this.topic_data = topic_data;
		this.group_data = group_data;
	}
}
