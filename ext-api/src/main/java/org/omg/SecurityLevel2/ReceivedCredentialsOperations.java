package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "ReceivedCredentials".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface ReceivedCredentialsOperations
	extends org.omg.SecurityLevel2.CredentialsOperations
{
	/* constants */
	/* operations  */
	org.omg.SecurityLevel2.Credentials accepting_credentials();
	short association_options_used();
	org.omg.Security.DelegationState delegation_state();
	org.omg.Security.DelegationMode delegation_mode();
}
