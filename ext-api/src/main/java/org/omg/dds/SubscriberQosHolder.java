package org.omg.dds;

/**
 * Generated from IDL struct "SubscriberQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class SubscriberQosHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SubscriberQos value;

	public SubscriberQosHolder ()
	{
	}
	public SubscriberQosHolder(final org.omg.dds.SubscriberQos initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.SubscriberQosHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.SubscriberQosHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.SubscriberQosHelper.write(_out, value);
	}
}
