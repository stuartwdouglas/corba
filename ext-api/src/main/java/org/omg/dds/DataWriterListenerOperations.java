package org.omg.dds;


/**
 * Generated from IDL interface "DataWriterListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface DataWriterListenerOperations
	extends org.omg.dds.ListenerOperations
{
	/* constants */
	/* operations  */
	void on_offered_deadline_missed(org.omg.dds.DataWriter writer, org.omg.dds.OfferedDeadlineMissedStatus status);
	void on_offered_incompatible_qos(org.omg.dds.DataWriter writer, org.omg.dds.OfferedIncompatibleQosStatus status);
	void on_liveliness_lost(org.omg.dds.DataWriter writer, org.omg.dds.LivelinessLostStatus status);
	void on_publication_match(org.omg.dds.DataWriter writer, org.omg.dds.PublicationMatchStatus status);
}
