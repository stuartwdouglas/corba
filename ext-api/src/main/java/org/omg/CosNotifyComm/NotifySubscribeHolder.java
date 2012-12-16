package org.omg.CosNotifyComm;

/**
 * Generated from IDL interface "NotifySubscribe".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class NotifySubscribeHolder	implements org.omg.CORBA.portable.Streamable{
	 public NotifySubscribe value;
	public NotifySubscribeHolder()
	{
	}
	public NotifySubscribeHolder (final NotifySubscribe initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NotifySubscribeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotifySubscribeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NotifySubscribeHelper.write (_out,value);
	}
}
