package org.omg.CosNotifyChannelAdminAck;


/**
 * Generated from IDL interface "SequenceProxyPullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class SequenceProxyPullSupplierAckHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyChannelAdminAck/SequenceProxyPullSupplierAck:1.0", "SequenceProxyPullSupplierAck");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdminAck/SequenceProxyPullSupplierAck:1.0";
	}
	public static SequenceProxyPullSupplierAck read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyChannelAdminAck._SequenceProxyPullSupplierAckStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck)
		{
			return (org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyChannelAdminAck/SequenceProxyPullSupplierAck:1.0"))
		{
			org.omg.CosNotifyChannelAdminAck._SequenceProxyPullSupplierAckStub stub;
			stub = new org.omg.CosNotifyChannelAdminAck._SequenceProxyPullSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck)
		{
			return (org.omg.CosNotifyChannelAdminAck.SequenceProxyPullSupplierAck)obj;
		}
		else
		{
			org.omg.CosNotifyChannelAdminAck._SequenceProxyPullSupplierAckStub stub;
			stub = new org.omg.CosNotifyChannelAdminAck._SequenceProxyPullSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
