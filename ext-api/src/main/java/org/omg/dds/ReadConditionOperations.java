package org.omg.dds;


/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public interface ReadConditionOperations
	extends org.omg.dds.ConditionOperations
{
	/* constants */
	/* operations  */
	int get_sample_state_mask();
	int get_view_state_mask();
	int get_instance_state_mask();
	org.omg.dds.DataReader get_datareader();
}
