package org.omg.CosNotification;

/**
 * Generated from IDL struct "PropertyError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class PropertyError
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyError(){}
	public org.omg.CosNotification.QoSError_code code;
	public java.lang.String name;
	public org.omg.CosNotification.PropertyRange available_range;
	public PropertyError(org.omg.CosNotification.QoSError_code code, java.lang.String name, org.omg.CosNotification.PropertyRange available_range)
	{
		this.code = code;
		this.name = name;
		this.available_range = available_range;
	}
}
