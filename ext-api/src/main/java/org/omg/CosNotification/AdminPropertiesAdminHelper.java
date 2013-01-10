package org.omg.CosNotification;


/**
 * Generated from IDL interface "AdminPropertiesAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class AdminPropertiesAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.AdminPropertiesAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotification.AdminPropertiesAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0", "AdminPropertiesAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0";
	}
	public static AdminPropertiesAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotification._AdminPropertiesAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotification.AdminPropertiesAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotification.AdminPropertiesAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotification.AdminPropertiesAdmin)
		{
			return (org.omg.CosNotification.AdminPropertiesAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"))
		{
			org.omg.CosNotification._AdminPropertiesAdminStub stub;
			stub = new org.omg.CosNotification._AdminPropertiesAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotification.AdminPropertiesAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotification.AdminPropertiesAdmin)
		{
			return (org.omg.CosNotification.AdminPropertiesAdmin)obj;
		}
		else
		{
			org.omg.CosNotification._AdminPropertiesAdminStub stub;
			stub = new org.omg.CosNotification._AdminPropertiesAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
