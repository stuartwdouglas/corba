package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL interface "StructuredProxyPullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class StructuredProxyPullSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPullSupplierAck value;
	public StructuredProxyPullSupplierAckHolder()
	{
	}
	public StructuredProxyPullSupplierAckHolder (final StructuredProxyPullSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPullSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPullSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPullSupplierAckHelper.write (_out,value);
	}
}
