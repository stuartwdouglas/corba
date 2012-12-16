package org.omg.PortableServer;


/**
 * Generated from IDL interface "ImplicitActivationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class ImplicitActivationPolicyLocalTie
	extends _ImplicitActivationPolicyLocalBase
{
	private ImplicitActivationPolicyOperations _delegate;

	public ImplicitActivationPolicyLocalTie(ImplicitActivationPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ImplicitActivationPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ImplicitActivationPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.ImplicitActivationPolicyValue value()
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
