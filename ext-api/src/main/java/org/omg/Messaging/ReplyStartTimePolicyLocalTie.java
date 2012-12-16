package org.omg.Messaging;


/**
 * Generated from IDL interface "ReplyStartTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class ReplyStartTimePolicyLocalTie
	extends _ReplyStartTimePolicyLocalBase
{
	private ReplyStartTimePolicyOperations _delegate;

	public ReplyStartTimePolicyLocalTie(ReplyStartTimePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ReplyStartTimePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ReplyStartTimePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public org.omg.TimeBase.UtcT start_time()
	{
		return _delegate.start_time();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
