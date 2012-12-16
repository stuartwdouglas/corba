package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public interface PushConsumerOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected;
	void disconnect_push_consumer();
}
