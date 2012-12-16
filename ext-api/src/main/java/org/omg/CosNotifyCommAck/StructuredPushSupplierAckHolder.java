package org.omg.CosNotifyCommAck;

/**
 * Generated from IDL interface "StructuredPushSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class StructuredPushSupplierAckHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredPushSupplierAck value;
	public StructuredPushSupplierAckHolder()
	{
	}
	public StructuredPushSupplierAckHolder (final StructuredPushSupplierAck initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredPushSupplierAckHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredPushSupplierAckHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredPushSupplierAckHelper.write (_out,value);
	}
}
