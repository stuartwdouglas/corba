package org.omg.GIOP;

/**
 * Generated from IDL struct "Version".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class VersionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.Version value;

	public VersionHolder ()
	{
	}
	public VersionHolder(final org.omg.GIOP.Version initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.VersionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.VersionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.VersionHelper.write(_out, value);
	}
}
