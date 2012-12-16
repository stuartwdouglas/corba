package org.omg.dds;

/**
 * Generated from IDL struct "PublisherQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PublisherQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public PublisherQos(){}
	public org.omg.dds.PresentationQosPolicy presentation;
	public org.omg.dds.PartitionQosPolicy partition;
	public org.omg.dds.GroupDataQosPolicy group_data;
	public org.omg.dds.EntityFactoryQosPolicy entity_factory;
	public PublisherQos(org.omg.dds.PresentationQosPolicy presentation, org.omg.dds.PartitionQosPolicy partition, org.omg.dds.GroupDataQosPolicy group_data, org.omg.dds.EntityFactoryQosPolicy entity_factory)
	{
		this.presentation = presentation;
		this.partition = partition;
		this.group_data = group_data;
		this.entity_factory = entity_factory;
	}
}
