package org.omg.CosNotifyCommAck;

/**
 * Generated from IDL interface "StructuredPullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class StructuredPullSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredPullSupplierAck value;
	public StructuredPullSupplierAckHolder()
	{
	}
	public StructuredPullSupplierAckHolder (final StructuredPullSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredPullSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredPullSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredPullSupplierAckHelper.write (_out,value);
	}
}
