package org.omg.Messaging;

/**
 * Generated from IDL interface "ReplyPriorityPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyPriorityPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReplyPriorityPolicy value;
	public ReplyPriorityPolicyHolder()
	{
	}
	public ReplyPriorityPolicyHolder (final ReplyPriorityPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReplyPriorityPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReplyPriorityPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReplyPriorityPolicyHelper.write (_out,value);
	}
}
