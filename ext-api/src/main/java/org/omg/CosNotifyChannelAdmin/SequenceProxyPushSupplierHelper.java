package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "SequenceProxyPushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class SequenceProxyPushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushSupplier:1.0", "SequenceProxyPushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushSupplier:1.0";
	}
	public static SequenceProxyPushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyChannelAdmin._SequenceProxyPushSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier)
		{
			return (org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushSupplier:1.0"))
		{
			org.omg.CosNotifyChannelAdmin._SequenceProxyPushSupplierStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._SequenceProxyPushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier)
		{
			return (org.omg.CosNotifyChannelAdmin.SequenceProxyPushSupplier)obj;
		}
		else
		{
			org.omg.CosNotifyChannelAdmin._SequenceProxyPushSupplierStub stub;
			stub = new org.omg.CosNotifyChannelAdmin._SequenceProxyPushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
