package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "SecurityContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface SecurityContextOperations
{
	/* constants */
	/* operations  */
	org.omg.Security.SecurityContextType context_type();
	org.omg.Security.SecurityContextState context_state();
	java.lang.String mechanism();
	boolean supports_refresh();
	byte[] chan_binding();
	org.omg.SecurityLevel2.ReceivedCredentials received_credentials();
	org.omg.Security.AssociationStatus continue_security_context(org.omg.Security.OpaqueBuffer in_token, org.omg.Security.OpaqueBufferHolder out_token);
	void protect_message(org.omg.Security.OpaqueBuffer message, org.omg.Security.QOP qop_, org.omg.Security.OpaqueBufferHolder text_buffer, org.omg.Security.OpaqueBufferHolder token);
	boolean reclaim_message(org.omg.Security.OpaqueBuffer text_buffer, org.omg.Security.OpaqueBuffer token, org.omg.Security.QOPHolder qop_, org.omg.Security.OpaqueBufferHolder message);
	boolean is_valid(org.omg.TimeBase.UtcTHolder expiry_time);
	boolean refresh_security_context(byte[] refresh_data, org.omg.Security.OpaqueBufferHolder out_token);
	boolean process_refresh_token(org.omg.Security.OpaqueBuffer refresh_token);
	boolean discard_security_context(byte[] discard_data, org.omg.Security.OpaqueBufferHolder out_token);
	boolean process_discard_token(org.omg.Security.OpaqueBuffer discard_token);
}
