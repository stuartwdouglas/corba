package org.omg.dds;


/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface PublisherOperations
	extends org.omg.dds.EntityOperations
{
	/* constants */
	/* operations  */
	org.omg.dds.DataWriter create_datawriter(org.omg.dds.Topic a_topic, org.omg.dds.DataWriterQos qos, org.omg.dds.DataWriterListener a_listener);
	int delete_datawriter(org.omg.dds.DataWriter a_datawriter);
	org.omg.dds.DataWriter lookup_datawriter(java.lang.String topic_name);
	int delete_contained_entities();
	int set_qos(org.omg.dds.PublisherQos qos);
	void get_qos(org.omg.dds.PublisherQosHolder qos);
	int set_listener(org.omg.dds.PublisherListener a_listener, int mask);
	org.omg.dds.PublisherListener get_listener();
	int suspend_publications();
	int resume_publications();
	int begin_coherent_changes();
	int end_coherent_changes();
	org.omg.dds.DomainParticipant get_participant();
	int set_default_datawriter_qos(org.omg.dds.DataWriterQos qos);
	void get_default_datawriter_qos(org.omg.dds.DataWriterQosHolder qos);
	int copy_from_topic_qos(org.omg.dds.DataWriterQosHolder a_datawriter_qos, org.omg.dds.TopicQos a_topic_qos);
}
