package org.omg.dds;


/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface TopicListenerOperations
	extends org.omg.dds.ListenerOperations
{
	/* constants */
	/* operations  */
	void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status);
}
