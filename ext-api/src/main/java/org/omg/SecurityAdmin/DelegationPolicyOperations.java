package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "DelegationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public interface DelegationPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_delegation_mode(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.DelegationMode mode);
	org.omg.Security.DelegationMode get_delegation_mode(org.omg.CORBA.InterfaceDef object_type);
}
