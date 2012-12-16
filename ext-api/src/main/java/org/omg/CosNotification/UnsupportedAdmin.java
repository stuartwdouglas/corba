package org.omg.CosNotification;

/**
 * Generated from IDL exception "UnsupportedAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class UnsupportedAdmin
	extends org.omg.CORBA.UserException
{
	public UnsupportedAdmin()
	{
		super(org.omg.CosNotification.UnsupportedAdminHelper.id());
	}

	public org.omg.CosNotification.PropertyError[] admin_err;
	public UnsupportedAdmin(java.lang.String _reason,org.omg.CosNotification.PropertyError[] admin_err)
	{
		super(_reason);
		this.admin_err = admin_err;
	}
	public UnsupportedAdmin(org.omg.CosNotification.PropertyError[] admin_err)
	{
		super(org.omg.CosNotification.UnsupportedAdminHelper.id());
		this.admin_err = admin_err;
	}
}
