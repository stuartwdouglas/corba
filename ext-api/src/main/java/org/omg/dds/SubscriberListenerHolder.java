package org.omg.dds;

/**
 * Generated from IDL interface "SubscriberListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class SubscriberListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SubscriberListener value;
	public SubscriberListenerHolder()
	{
	}
	public SubscriberListenerHolder (final SubscriberListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SubscriberListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubscriberListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SubscriberListenerHelper.write (_out,value);
	}
}
