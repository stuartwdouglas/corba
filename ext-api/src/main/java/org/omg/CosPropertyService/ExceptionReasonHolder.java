package org.omg.CosPropertyService;
/**
 * Generated from IDL enum "ExceptionReason".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class ExceptionReasonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ExceptionReason value;

	public ExceptionReasonHolder ()
	{
	}
	public ExceptionReasonHolder (final ExceptionReason initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionReasonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionReasonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionReasonHelper.write (out,value);
	}
}
