package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "SequencePushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class SequencePushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequencePushSupplier value;
	public SequencePushSupplierHolder()
	{
	}
	public SequencePushSupplierHolder (final SequencePushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequencePushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequencePushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequencePushSupplierHelper.write (_out,value);
	}
}
