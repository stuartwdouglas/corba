package org.omg.dds;

/**
 * Generated from IDL struct "SampleRejectedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleRejectedStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SampleRejectedStatus value;

	public SampleRejectedStatusHolder ()
	{
	}
	public SampleRejectedStatusHolder(final org.omg.dds.SampleRejectedStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.SampleRejectedStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.SampleRejectedStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.SampleRejectedStatusHelper.write(_out, value);
	}
}
