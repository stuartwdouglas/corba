package org.omg.CosNotification;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AdminPropertiesAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class AdminPropertiesAdminPOATie
	extends AdminPropertiesAdminPOA
{
	private AdminPropertiesAdminOperations _delegate;

	private POA _poa;
	public AdminPropertiesAdminPOATie(AdminPropertiesAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public AdminPropertiesAdminPOATie(AdminPropertiesAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotification.AdminPropertiesAdmin _this()
	{
		return org.omg.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object());
	}
	public org.omg.CosNotification.AdminPropertiesAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object(orb));
	}
	public AdminPropertiesAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AdminPropertiesAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void set_admin(org.omg.CosNotification.Property[] admin) throws org.omg.CosNotification.UnsupportedAdmin
	{
_delegate.set_admin(admin);
	}

	public org.omg.CosNotification.Property[] get_admin()
	{
		return _delegate.get_admin();
	}

}
