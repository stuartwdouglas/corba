package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "LockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class LockSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public LockSet value;
	public LockSetHolder()
	{
	}
	public LockSetHolder (final LockSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LockSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LockSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LockSetHelper.write (_out,value);
	}
}
