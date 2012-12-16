package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "AuditDecision".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public interface AuditDecisionOperations
{
	/* constants */
	/* operations  */
	boolean audit_needed(org.omg.Security.AuditEventType event_type, org.omg.Security.SelectorValue[] value_list);
	org.omg.SecurityLevel2.AuditChannel audit_channel();
}
