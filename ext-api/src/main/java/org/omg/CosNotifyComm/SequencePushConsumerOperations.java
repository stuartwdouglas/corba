package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "SequencePushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface SequencePushConsumerOperations
	extends org.omg.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_events(org.omg.CosNotification.StructuredEvent[] notifications) throws org.omg.CosEventComm.Disconnected;
	void disconnect_sequence_push_consumer();
}
