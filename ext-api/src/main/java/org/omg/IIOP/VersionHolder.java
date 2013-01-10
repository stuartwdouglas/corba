package org.omg.IIOP;

/**
 * Generated from IDL struct "Version".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class VersionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IIOP.Version value;

	public VersionHolder ()
	{
	}
	public VersionHolder(final org.omg.IIOP.Version initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IIOP.VersionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IIOP.VersionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IIOP.VersionHelper.write(_out, value);
	}
}
