package org.omg.CosNotification;

/**
 * Generated from IDL interface "AdminPropertiesAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class AdminPropertiesAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public AdminPropertiesAdmin value;
	public AdminPropertiesAdminHolder()
	{
	}
	public AdminPropertiesAdminHolder (final AdminPropertiesAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AdminPropertiesAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminPropertiesAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AdminPropertiesAdminHelper.write (_out,value);
	}
}
