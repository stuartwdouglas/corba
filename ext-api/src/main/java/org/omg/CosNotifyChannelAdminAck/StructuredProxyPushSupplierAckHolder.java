package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL interface "StructuredProxyPushSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class StructuredProxyPushSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushSupplierAck value;
	public StructuredProxyPushSupplierAckHolder()
	{
	}
	public StructuredProxyPushSupplierAckHolder (final StructuredProxyPushSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPushSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushSupplierAckHelper.write (_out,value);
	}
}
