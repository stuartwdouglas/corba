package org.omg.BridgeTransactionMgmt;

/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TransactionManagementHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionManagement value;
	public TransactionManagementHolder()
	{
	}
	public TransactionManagementHolder (final TransactionManagement initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionManagementHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionManagementHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionManagementHelper.write (_out,value);
	}
}
