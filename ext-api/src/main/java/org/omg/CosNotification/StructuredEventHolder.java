package org.omg.CosNotification;

/**
 * Generated from IDL struct "StructuredEvent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class StructuredEventHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.StructuredEvent value;

	public StructuredEventHolder ()
	{
	}
	public StructuredEventHolder(final org.omg.CosNotification.StructuredEvent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.StructuredEventHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.StructuredEventHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.StructuredEventHelper.write(_out, value);
	}
}
