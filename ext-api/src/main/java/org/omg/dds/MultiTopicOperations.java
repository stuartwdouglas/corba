package org.omg.dds;


/**
 * Generated from IDL interface "MultiTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface MultiTopicOperations
	extends org.omg.dds.TopicDescriptionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_subscription_expression();
	java.lang.String[] get_expression_parameters();
	int set_expression_parameters(java.lang.String[] expression_parameters);
}
