package org.omg.dds;


/**
 * Generated from IDL interface "DomainParticipantFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public interface DomainParticipantFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.dds.DomainParticipant create_participant(int domainId, org.omg.dds.DomainParticipantQos qos, org.omg.dds.DomainParticipantListener a_listener);
	int delete_participant(org.omg.dds.DomainParticipant a_participant);
	org.omg.dds.DomainParticipant lookup_participant(int domainId);
	int set_default_participant_qos(org.omg.dds.DomainParticipantQos qos);
	void get_default_participant_qos(org.omg.dds.DomainParticipantQosHolder qos);
}
