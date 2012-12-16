package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public final class TypedSupplierAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedEventChannelAdmin/TypedSupplierAdmin:1.0", "TypedSupplierAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedEventChannelAdmin/TypedSupplierAdmin:1.0";
	}
	public static TypedSupplierAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedEventChannelAdmin._TypedSupplierAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin)
		{
			return (org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedEventChannelAdmin/TypedSupplierAdmin:1.0"))
		{
			org.omg.CosTypedEventChannelAdmin._TypedSupplierAdminStub stub;
			stub = new org.omg.CosTypedEventChannelAdmin._TypedSupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin)
		{
			return (org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin)obj;
		}
		else
		{
			org.omg.CosTypedEventChannelAdmin._TypedSupplierAdminStub stub;
			stub = new org.omg.CosTypedEventChannelAdmin._TypedSupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
