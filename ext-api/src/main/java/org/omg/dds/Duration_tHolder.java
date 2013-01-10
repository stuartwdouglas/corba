package org.omg.dds;

/**
 * Generated from IDL struct "Duration_t".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class Duration_tHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.Duration_t value;

	public Duration_tHolder ()
	{
	}
	public Duration_tHolder(final org.omg.dds.Duration_t initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.Duration_tHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.Duration_tHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.Duration_tHelper.write(_out, value);
	}
}
