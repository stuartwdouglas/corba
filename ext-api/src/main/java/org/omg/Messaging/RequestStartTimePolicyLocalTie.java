package org.omg.Messaging;


/**
 * Generated from IDL interface "RequestStartTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class RequestStartTimePolicyLocalTie
	extends _RequestStartTimePolicyLocalBase
{
	private RequestStartTimePolicyOperations _delegate;

	public RequestStartTimePolicyLocalTie(RequestStartTimePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RequestStartTimePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RequestStartTimePolicyOperations delegate)
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
