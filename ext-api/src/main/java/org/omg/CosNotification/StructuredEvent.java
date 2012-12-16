package org.omg.CosNotification;

/**
 * Generated from IDL struct "StructuredEvent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class StructuredEvent
	implements org.omg.CORBA.portable.IDLEntity
{
	public StructuredEvent(){}
	public org.omg.CosNotification.EventHeader header;
	public org.omg.CosNotification.Property[] filterable_data;
	public org.omg.CORBA.Any remainder_of_body;
	public StructuredEvent(org.omg.CosNotification.EventHeader header, org.omg.CosNotification.Property[] filterable_data, org.omg.CORBA.Any remainder_of_body)
	{
		this.header = header;
		this.filterable_data = filterable_data;
		this.remainder_of_body = remainder_of_body;
	}
}
