package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL interface "SequenceProxyPullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class SequenceProxyPullSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullSupplierAck value;
	public SequenceProxyPullSupplierAckHolder()
	{
	}
	public SequenceProxyPullSupplierAckHolder (final SequenceProxyPullSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullSupplierAckHelper.write (_out,value);
	}
}
