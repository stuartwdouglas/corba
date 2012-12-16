package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "ServerSecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public interface ServerSecurityContextOperations
	extends org.omg.SecurityReplaceable.SecurityContextOperations
{
	/* constants */
	/* operations  */
	short association_options_used();
	org.omg.Security.DelegationMode delegation_mode();
	org.omg.SecurityLevel2.Credentials server_credentials();
	short server_options_supported();
	byte[] server_security_name();
}
