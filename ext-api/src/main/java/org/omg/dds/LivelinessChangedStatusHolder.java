package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessChangedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessChangedStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.LivelinessChangedStatus value;

	public LivelinessChangedStatusHolder ()
	{
	}
	public LivelinessChangedStatusHolder(final org.omg.dds.LivelinessChangedStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.LivelinessChangedStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.LivelinessChangedStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.LivelinessChangedStatusHelper.write(_out, value);
	}
}
