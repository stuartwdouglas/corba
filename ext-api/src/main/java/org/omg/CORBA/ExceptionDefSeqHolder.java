package org.omg.CORBA;

/**
 * Generated from IDL alias "ExceptionDefSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ExceptionDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExceptionDef[] value;

	public ExceptionDefSeqHolder ()
	{
	}
	public ExceptionDefSeqHolder (final org.omg.CORBA.ExceptionDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionDefSeqHelper.write (out,value);
	}
}
