package org.omg.CosNotification;

/**
 * Generated from IDL exception "UnsupportedQoS".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	public UnsupportedQoS()
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id());
	}

	public org.omg.CosNotification.PropertyError[] qos_err;
	public UnsupportedQoS(java.lang.String _reason,org.omg.CosNotification.PropertyError[] qos_err)
	{
		super(_reason);
		this.qos_err = qos_err;
	}
	public UnsupportedQoS(org.omg.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id());
		this.qos_err = qos_err;
	}
}
