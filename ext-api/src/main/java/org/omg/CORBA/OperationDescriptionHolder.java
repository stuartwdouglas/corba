package org.omg.CORBA;

/**
 * Generated from IDL struct "OperationDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class OperationDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.OperationDescription value;

	public OperationDescriptionHolder ()
	{
	}
	public OperationDescriptionHolder(final org.omg.CORBA.OperationDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.OperationDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.OperationDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.OperationDescriptionHelper.write(_out, value);
	}
}
