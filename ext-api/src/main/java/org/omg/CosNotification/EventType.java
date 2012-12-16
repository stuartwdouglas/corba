package org.omg.CosNotification;

/**
 * Generated from IDL struct "EventType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class EventType
	implements org.omg.CORBA.portable.IDLEntity
{
	public EventType(){}
	public java.lang.String domain_name = "";
	public java.lang.String type_name = "";
	public EventType(java.lang.String domain_name, java.lang.String type_name)
	{
		this.domain_name = domain_name;
		this.type_name = type_name;
	}
}
