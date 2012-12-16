package org.omg.PortableServer;


/**
 * Generated from IDL interface "RequestProcessingPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class RequestProcessingPolicyLocalTie
	extends _RequestProcessingPolicyLocalBase
{
	private RequestProcessingPolicyOperations _delegate;

	public RequestProcessingPolicyLocalTie(RequestProcessingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RequestProcessingPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RequestProcessingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.RequestProcessingPolicyValue value()
	{
		return _delegate.value();
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

}
