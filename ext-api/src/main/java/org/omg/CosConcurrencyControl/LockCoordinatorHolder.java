package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "LockCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class LockCoordinatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public LockCoordinator value;
	public LockCoordinatorHolder()
	{
	}
	public LockCoordinatorHolder (final LockCoordinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LockCoordinatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LockCoordinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LockCoordinatorHelper.write (_out,value);
	}
}
