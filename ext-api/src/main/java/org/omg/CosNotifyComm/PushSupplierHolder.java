package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class PushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public PushSupplier value;
	public PushSupplierHolder()
	{
	}
	public PushSupplierHolder (final PushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PushSupplierHelper.write (_out,value);
	}
}
