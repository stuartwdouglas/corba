package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "AccessDecision".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public interface AccessDecisionOperations
{
	/* constants */
	/* operations  */
	boolean access_allowed(org.omg.SecurityLevel2.Credentials[] cred_list, org.omg.CORBA.Object target, java.lang.String operation_name, java.lang.String target_interface_name);
}
