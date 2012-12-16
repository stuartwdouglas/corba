package org.omg.CosTransactions;

/**
 * Generated from IDL interface "Coordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class CoordinatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Coordinator value;
	public CoordinatorHolder()
	{
	}
	public CoordinatorHolder (final Coordinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CoordinatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CoordinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CoordinatorHelper.write (_out,value);
	}
}
