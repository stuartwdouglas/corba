package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "SequenceProxyPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class SequenceProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullSupplier value;
	public SequenceProxyPullSupplierHolder()
	{
	}
	public SequenceProxyPullSupplierHolder (final SequenceProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullSupplierHelper.write (_out,value);
	}
}
