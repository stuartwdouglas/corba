package org.omg.Messaging;

/**
 * Generated from IDL struct "PriorityRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class PriorityRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Messaging.PriorityRange value;

	public PriorityRangeHolder ()
	{
	}
	public PriorityRangeHolder(final org.omg.Messaging.PriorityRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Messaging.PriorityRangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Messaging.PriorityRangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Messaging.PriorityRangeHelper.write(_out, value);
	}
}
