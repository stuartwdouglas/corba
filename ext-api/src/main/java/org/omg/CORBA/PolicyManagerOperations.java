package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public interface PolicyManagerOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Policy[] get_policy_overrides(int[] ts);
	void set_policy_overrides(org.omg.CORBA.Policy[] policies, org.omg.CORBA.SetOverrideType set_add) throws org.omg.CORBA.InvalidPolicies;
}
