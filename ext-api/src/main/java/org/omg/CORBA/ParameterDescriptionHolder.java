package org.omg.CORBA;

/**
 * Generated from IDL struct "ParameterDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ParameterDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ParameterDescription value;

	public ParameterDescriptionHolder ()
	{
	}
	public ParameterDescriptionHolder(final org.omg.CORBA.ParameterDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ParameterDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ParameterDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ParameterDescriptionHelper.write(_out, value);
	}
}
