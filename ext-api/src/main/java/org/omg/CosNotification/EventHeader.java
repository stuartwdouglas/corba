package org.omg.CosNotification;

/**
 * Generated from IDL struct "EventHeader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class EventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public EventHeader(){}
	public org.omg.CosNotification.FixedEventHeader fixed_header;
	public org.omg.CosNotification.Property[] variable_header;
	public EventHeader(org.omg.CosNotification.FixedEventHeader fixed_header, org.omg.CosNotification.Property[] variable_header)
	{
		this.fixed_header = fixed_header;
		this.variable_header = variable_header;
	}
}
