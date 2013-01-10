package org.omg.CORBA;

/**
 * Generated from IDL interface "IRObject".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class IRObjectHolder	implements org.omg.CORBA.portable.Streamable{
	 public IRObject value;
	public IRObjectHolder()
	{
	}
	public IRObjectHolder (final IRObject initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IRObjectHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IRObjectHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IRObjectHelper.write (_out,value);
	}
}
