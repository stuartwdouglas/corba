package org.omg.dds;


/**
 * Generated from IDL interface "DataReaderListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public interface DataReaderListenerOperations
	extends org.omg.dds.ListenerOperations
{
	/* constants */
	/* operations  */
	void on_requested_deadline_missed(org.omg.dds.DataReader reader, org.omg.dds.RequestedDeadlineMissedStatus status);
	void on_requested_incompatible_qos(org.omg.dds.DataReader reader, org.omg.dds.RequestedIncompatibleQosStatus status);
	void on_sample_rejected(org.omg.dds.DataReader reader, org.omg.dds.SampleRejectedStatus status);
	void on_liveliness_changed(org.omg.dds.DataReader reader, org.omg.dds.LivelinessChangedStatus status);
	void on_data_available(org.omg.dds.DataReader reader);
	void on_subscription_match(org.omg.dds.DataReader reader, org.omg.dds.SubscriptionMatchStatus status);
	void on_sample_lost(org.omg.dds.DataReader reader, org.omg.dds.SampleLostStatus status);
}
