package org.omg.Messaging;

/**
 * Generated from IDL interface "ReplyEndTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyEndTimePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReplyEndTimePolicy value;
	public ReplyEndTimePolicyHolder()
	{
	}
	public ReplyEndTimePolicyHolder (final ReplyEndTimePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReplyEndTimePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReplyEndTimePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReplyEndTimePolicyHelper.write (_out,value);
	}
}
