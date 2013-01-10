package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class LockSetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public LockSetFactory value;
	public LockSetFactoryHolder()
	{
	}
	public LockSetFactoryHolder (final LockSetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LockSetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LockSetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LockSetFactoryHelper.write (_out,value);
	}
}
