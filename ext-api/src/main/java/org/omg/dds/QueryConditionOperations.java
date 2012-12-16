package org.omg.dds;


/**
 * Generated from IDL interface "QueryCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface QueryConditionOperations
	extends org.omg.dds.ReadConditionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_query_expression();
	java.lang.String[] get_query_arguments();
	int set_query_arguments(java.lang.String[] query_arguments);
}
