package org.omg.Messaging;


/**
 * Generated from IDL interface "RelativeRequestTimeoutPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class RelativeRequestTimeoutPolicyLocalTie
	extends _RelativeRequestTimeoutPolicyLocalBase
{
	private RelativeRequestTimeoutPolicyOperations _delegate;

	public RelativeRequestTimeoutPolicyLocalTie(RelativeRequestTimeoutPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RelativeRequestTimeoutPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RelativeRequestTimeoutPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public long relative_expiry()
	{
		return _delegate.relative_expiry();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
