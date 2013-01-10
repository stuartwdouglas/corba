package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "ClientSecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface ClientSecurityContextOperations
	extends org.omg.SecurityReplaceable.SecurityContextOperations
{
	/* constants */
	/* operations  */
	short association_options_used();
	org.omg.Security.DelegationMode delegation_mode();
	byte[] mech_data();
	org.omg.SecurityLevel2.Credentials client_credentials();
	short server_options_supported();
	byte[] server_security_name();
}
