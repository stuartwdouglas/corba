package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "AuditChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface AuditChannelOperations
{
	/* constants */
	/* operations  */
	void audit_write(org.omg.Security.AuditEventType event_type, org.omg.SecurityLevel2.Credentials[] creds, org.omg.TimeBase.UtcT time, org.omg.Security.SelectorValue[] descriptors, byte[] event_specific_data);
	int audit_channel_id();
}
