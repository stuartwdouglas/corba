package org.omg.dds;

/**
 * Generated from IDL struct "DomainParticipantQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DomainParticipantQos
	implements org.omg.CORBA.portable.IDLEntity
{
	public DomainParticipantQos(){}
	public org.omg.dds.UserDataQosPolicy user_data;
	public org.omg.dds.EntityFactoryQosPolicy entity_factory;
	public DomainParticipantQos(org.omg.dds.UserDataQosPolicy user_data, org.omg.dds.EntityFactoryQosPolicy entity_factory)
	{
		this.user_data = user_data;
		this.entity_factory = entity_factory;
	}
}
