package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "SecureInvocationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface SecureInvocationPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_association_options(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.RequiresSupports requires_supports, org.omg.Security.CommunicationDirection direction, short options);
	short get_association_options(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.RequiresSupports requires_supports, org.omg.Security.CommunicationDirection direction);
}
