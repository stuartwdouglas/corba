package org.omg.CORBA;

/**
 * Generated from IDL struct "Initializer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class InitializerHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Initializer value;

	public InitializerHolder ()
	{
	}
	public InitializerHolder(final org.omg.CORBA.Initializer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.InitializerHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.InitializerHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.InitializerHelper.write(_out, value);
	}
}
