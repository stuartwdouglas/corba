package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public final class ProxyPushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.ProxyPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0", "ProxyPushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0";
	}
	public static ProxyPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventChannelAdmin._ProxyPushConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.ProxyPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ProxyPushConsumer)
		{
			return (org.omg.CosEventChannelAdmin.ProxyPushConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0"))
		{
			org.omg.CosEventChannelAdmin._ProxyPushConsumerStub stub;
			stub = new org.omg.CosEventChannelAdmin._ProxyPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.ProxyPushConsumer)
		{
			return (org.omg.CosEventChannelAdmin.ProxyPushConsumer)obj;
		}
		else
		{
			org.omg.CosEventChannelAdmin._ProxyPushConsumerStub stub;
			stub = new org.omg.CosEventChannelAdmin._ProxyPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
