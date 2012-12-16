package org.omg.ETF;

/**
 * Generated from IDL interface "Factories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class FactoriesHolder	implements org.omg.CORBA.portable.Streamable{
	 public Factories value;
	public FactoriesHolder()
	{
	}
	public FactoriesHolder (final Factories initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FactoriesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FactoriesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FactoriesHelper.write (_out,value);
	}
}
