package org.omg.dds;

/**
 * Generated from IDL struct "SubscriberQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SubscriberQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public SubscriberQos(){}
	public org.omg.dds.PresentationQosPolicy presentation;
	public org.omg.dds.PartitionQosPolicy partition;
	public org.omg.dds.GroupDataQosPolicy group_data;
	public org.omg.dds.EntityFactoryQosPolicy entity_factory;
	public SubscriberQos(org.omg.dds.PresentationQosPolicy presentation, org.omg.dds.PartitionQosPolicy partition, org.omg.dds.GroupDataQosPolicy group_data, org.omg.dds.EntityFactoryQosPolicy entity_factory)
	{
		this.presentation = presentation;
		this.partition = partition;
		this.group_data = group_data;
		this.entity_factory = entity_factory;
	}
}
