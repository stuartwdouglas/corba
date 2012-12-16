package org.omg.GIOP;

/**
 * Generated from IDL struct "IORAddressingInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class IORAddressingInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.IORAddressingInfo value;

	public IORAddressingInfoHolder ()
	{
	}
	public IORAddressingInfoHolder(final org.omg.GIOP.IORAddressingInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.IORAddressingInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.IORAddressingInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.IORAddressingInfoHelper.write(_out, value);
	}
}
