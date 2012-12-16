package org.omg.Messaging;


/**
 * Generated from IDL interface "QueueOrderPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class QueueOrderPolicyLocalTie
	extends _QueueOrderPolicyLocalBase
{
	private QueueOrderPolicyOperations _delegate;

	public QueueOrderPolicyLocalTie(QueueOrderPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public QueueOrderPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QueueOrderPolicyOperations delegate)
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

	public void destroy()
	{
_delegate.destroy();
	}

	public short allowed_orders()
	{
		return _delegate.allowed_orders();
	}

}
