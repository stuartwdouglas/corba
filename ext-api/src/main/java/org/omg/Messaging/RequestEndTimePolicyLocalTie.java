package org.omg.Messaging;


/**
 * Generated from IDL interface "RequestEndTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class RequestEndTimePolicyLocalTie
	extends _RequestEndTimePolicyLocalBase
{
	private RequestEndTimePolicyOperations _delegate;

	public RequestEndTimePolicyLocalTie(RequestEndTimePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RequestEndTimePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RequestEndTimePolicyOperations delegate)
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

	public org.omg.TimeBase.UtcT end_time()
	{
		return _delegate.end_time();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
