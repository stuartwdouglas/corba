package org.omg.CosTime;

/**
 * Generated from IDL interface "UTO".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class UTOHolder	implements org.omg.CORBA.portable.Streamable{
	 public UTO value;
	public UTOHolder()
	{
	}
	public UTOHolder (final UTO initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return UTOHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = UTOHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		UTOHelper.write (_out,value);
	}
}
