package org.omg.ETF;

/**
 * Generated from IDL interface "Handle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class HandleHolder	implements org.omg.CORBA.portable.Streamable{
	 public Handle value;
	public HandleHolder()
	{
	}
	public HandleHolder (final Handle initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HandleHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HandleHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HandleHelper.write (_out,value);
	}
}
