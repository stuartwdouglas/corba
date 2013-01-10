package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "TransactionalLockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransactionalLockSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionalLockSet value;
	public TransactionalLockSetHolder()
	{
	}
	public TransactionalLockSetHolder (final TransactionalLockSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionalLockSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionalLockSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionalLockSetHelper.write (_out,value);
	}
}
