package org.omg.CONV_FRAME;

/**
 * Generated from IDL struct "CodeSetContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CodeSetContextHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CONV_FRAME.CodeSetContext value;

	public CodeSetContextHolder ()
	{
	}
	public CodeSetContextHolder(final org.omg.CONV_FRAME.CodeSetContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CONV_FRAME.CodeSetContextHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CONV_FRAME.CodeSetContextHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CONV_FRAME.CodeSetContextHelper.write(_out, value);
	}
}
