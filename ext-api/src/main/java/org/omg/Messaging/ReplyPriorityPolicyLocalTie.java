package org.omg.Messaging;


/**
 * Generated from IDL interface "ReplyPriorityPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class ReplyPriorityPolicyLocalTie
	extends _ReplyPriorityPolicyLocalBase
{
	private ReplyPriorityPolicyOperations _delegate;

	public ReplyPriorityPolicyLocalTie(ReplyPriorityPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ReplyPriorityPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ReplyPriorityPolicyOperations delegate)
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

	public org.omg.Messaging.PriorityRange priority_range()
	{
		return _delegate.priority_range();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
