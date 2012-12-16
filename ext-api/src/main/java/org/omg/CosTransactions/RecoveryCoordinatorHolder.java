package org.omg.CosTransactions;

/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class RecoveryCoordinatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public RecoveryCoordinator value;
	public RecoveryCoordinatorHolder()
	{
	}
	public RecoveryCoordinatorHolder (final RecoveryCoordinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RecoveryCoordinatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RecoveryCoordinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RecoveryCoordinatorHelper.write (_out,value);
	}
}
