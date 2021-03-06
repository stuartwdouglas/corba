package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ProxyPushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.ProxyPushSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0", "ProxyPushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0";
	}
	public static ProxyPushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventChannelAdmin._ProxyPushSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.ProxyPushSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ProxyPushSupplier)
		{
			return (org.omg.CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0"))
		{
			org.omg.CosEventChannelAdmin._ProxyPushSupplierStub stub;
			stub = new org.omg.CosEventChannelAdmin._ProxyPushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ProxyPushSupplier)
		{
			return (org.omg.CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		else
		{
			org.omg.CosEventChannelAdmin._ProxyPushSupplierStub stub;
			stub = new org.omg.CosEventChannelAdmin._ProxyPushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
