package org.omg.CORBA;

/**
 * Generated from IDL interface "ExceptionDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ExceptionDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExceptionDef value;
	public ExceptionDefHolder()
	{
	}
	public ExceptionDefHolder (final ExceptionDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExceptionDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExceptionDefHelper.write (_out,value);
	}
}
