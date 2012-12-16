package org.omg.Messaging;

/**
 * Generated from IDL interface "ReplyStartTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyStartTimePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReplyStartTimePolicy value;
	public ReplyStartTimePolicyHolder()
	{
	}
	public ReplyStartTimePolicyHolder (final ReplyStartTimePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReplyStartTimePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReplyStartTimePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReplyStartTimePolicyHelper.write (_out,value);
	}
}
