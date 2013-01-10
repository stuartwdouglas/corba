package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "DelegationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface DelegationPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_delegation_mode(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.DelegationMode mode);
	org.omg.Security.DelegationMode get_delegation_mode(org.omg.CORBA.InterfaceDef object_type);
}
