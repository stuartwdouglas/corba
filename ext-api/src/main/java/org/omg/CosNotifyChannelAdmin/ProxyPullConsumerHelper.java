package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ProxyPullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.ProxyPullConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/ProxyPullConsumer:1.0", "ProxyPullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/ProxyPullConsumer:1.0";
	}
	public static ProxyPullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyChannelAdmin._ProxyPullConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdmin.ProxyPullConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.ProxyPullConsumer)
		{
			return (org.omg.CosNotifyChannelAdmin.ProxyPullConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/ProxyPullConsumer:1.0"))
		{
			org.omg.CosNotifyChannelAdmin._ProxyPullConsumerStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._ProxyPullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyChannelAdmin.ProxyPullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.ProxyPullConsumer)
		{
			return (org.omg.CosNotifyChannelAdmin.ProxyPullConsumer)obj;
		}
		else
		{
			org.omg.CosNotifyChannelAdmin._ProxyPullConsumerStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._ProxyPullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
