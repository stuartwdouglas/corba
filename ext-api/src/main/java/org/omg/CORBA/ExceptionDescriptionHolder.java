package org.omg.CORBA;

/**
 * Generated from IDL struct "ExceptionDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ExceptionDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExceptionDescription value;

	public ExceptionDescriptionHolder ()
	{
	}
	public ExceptionDescriptionHolder(final org.omg.CORBA.ExceptionDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ExceptionDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ExceptionDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ExceptionDescriptionHelper.write(_out, value);
	}
}
