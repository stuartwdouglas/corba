package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "ReceivedCredentials".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
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
