package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ProxyPullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.ProxyPullSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/ProxyPullSupplier:1.0", "ProxyPullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ProxyPullSupplier:1.0";
	}
	public static ProxyPullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyChannelAdmin._ProxyPullSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdmin.ProxyPullSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.ProxyPullSupplier)
		{
			return (org.omg.CosNotifyChannelAdmin.ProxyPullSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/ProxyPullSupplier:1.0"))
		{
			org.omg.CosNotifyChannelAdmin._ProxyPullSupplierStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._ProxyPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.ProxyPullSupplier)
		{
			return (org.omg.CosNotifyChannelAdmin.ProxyPullSupplier)obj;
		}
		else
		{
			org.omg.CosNotifyChannelAdmin._ProxyPullSupplierStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._ProxyPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
