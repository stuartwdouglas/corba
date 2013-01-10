package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL exception "AdminLimitExceeded".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class AdminLimitExceeded
	extends org.omg.CORBA.UserException
{
	public AdminLimitExceeded()
	{
		super(org.omg.CosNotifyChannelAdmin.AdminLimitExceededHelper.id());
	}

	public org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err;
	public AdminLimitExceeded(java.lang.String _reason,org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		super(_reason);
		this.admin_property_err = admin_property_err;
	}
	public AdminLimitExceeded(org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		super(org.omg.CosNotifyChannelAdmin.AdminLimitExceededHelper.id());
		this.admin_property_err = admin_property_err;
	}
}
