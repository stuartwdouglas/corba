package org.omg.CosNotification;

/**
 * Generated from IDL struct "NamedPropertyRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class NamedPropertyRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.NamedPropertyRange value;

	public NamedPropertyRangeHolder ()
	{
	}
	public NamedPropertyRangeHolder(final org.omg.CosNotification.NamedPropertyRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.NamedPropertyRangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.NamedPropertyRangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.NamedPropertyRangeHelper.write(_out, value);
	}
}
