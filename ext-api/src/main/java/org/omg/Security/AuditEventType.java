package org.omg.Security;

/**
 * Generated from IDL struct "AuditEventType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AuditEventType
	implements org.omg.CORBA.portable.IDLEntity
{
	public AuditEventType(){}
	public org.omg.Security.ExtensibleFamily event_family;
	public short event_type;
	public AuditEventType(org.omg.Security.ExtensibleFamily event_family, short event_type)
	{
		this.event_family = event_family;
		this.event_type = event_type;
	}
}
