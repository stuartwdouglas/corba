package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "AuditPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public interface AuditPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_audit_selectors(java.lang.String object_type, org.omg.Security.AuditEventType[] events, org.omg.Security.SelectorValue[] selectors, org.omg.Security.AuditCombinator audit_combinator);
	void clear_audit_selectors(java.lang.String object_type, org.omg.Security.AuditEventType[] events);
	void replace_audit_selectors(java.lang.String object_type, org.omg.Security.AuditEventType[] events, org.omg.Security.SelectorValue[] selectors, org.omg.Security.AuditCombinator audit_combinator);
	void get_audit_selectors(java.lang.String object_type, org.omg.Security.AuditEventType event_type, org.omg.Security.SelectorValueListHolder selectors, org.omg.Security.AuditCombinatorHolder audit_combinator);
	void set_audit_channel(int audit_channel_id);
}
