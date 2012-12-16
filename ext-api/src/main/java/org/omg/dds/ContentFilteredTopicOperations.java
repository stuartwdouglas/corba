package org.omg.dds;


/**
 * Generated from IDL interface "ContentFilteredTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface ContentFilteredTopicOperations
	extends org.omg.dds.TopicDescriptionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_filter_expression();
	java.lang.String[] get_expression_parameters();
	int set_expression_parameters(java.lang.String[] expression_parameters);
	org.omg.dds.Topic get_related_topic();
}
