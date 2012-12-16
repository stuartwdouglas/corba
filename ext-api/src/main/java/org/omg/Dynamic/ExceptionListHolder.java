package org.omg.Dynamic;

/**
 * Generated from IDL alias "ExceptionList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ExceptionListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.TypeCode[] value;

	public ExceptionListHolder ()
	{
	}
	public ExceptionListHolder (final org.omg.CORBA.TypeCode[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionListHelper.write (out,value);
	}
}
