package org.omg.Messaging;

/**
 * Generated from IDL interface "ReplyHandler".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyHandlerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReplyHandler value;
	public ReplyHandlerHolder()
	{
	}
	public ReplyHandlerHolder (final ReplyHandler initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReplyHandlerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReplyHandlerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReplyHandlerHelper.write (_out,value);
	}
}
