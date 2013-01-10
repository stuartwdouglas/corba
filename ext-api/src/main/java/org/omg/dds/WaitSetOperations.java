package org.omg.dds;


/**
 * Generated from IDL interface "WaitSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public interface WaitSetOperations
{
	/* constants */
	/* operations  */
	int _wait(org.omg.dds.ConditionSeqHolder active_conditions, org.omg.dds.Duration_t timeout);
	int attach_condition(org.omg.dds.Condition cond);
	int detach_condition(org.omg.dds.Condition cond);
	int get_conditions(org.omg.dds.ConditionSeqHolder attached_conditions);
}
