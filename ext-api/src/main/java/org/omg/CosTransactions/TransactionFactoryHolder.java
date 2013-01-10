package org.omg.CosTransactions;

/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransactionFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionFactory value;
	public TransactionFactoryHolder()
	{
	}
	public TransactionFactoryHolder (final TransactionFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionFactoryHelper.write (_out,value);
	}
}
