package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "SequencePullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class SequencePullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequencePullSupplier value;
	public SequencePullSupplierHolder()
	{
	}
	public SequencePullSupplierHolder (final SequencePullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequencePullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequencePullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequencePullSupplierHelper.write (_out,value);
	}
}
