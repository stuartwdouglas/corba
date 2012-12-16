package org.omg.dds;


/**
 * Generated from IDL interface "StatusCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface StatusConditionOperations
	extends org.omg.dds.ConditionOperations
{
	/* constants */
	/* operations  */
	int get_enabled_statuses();
	int set_enabled_statuses(int mask);
	org.omg.dds.Entity get_entity();
}
