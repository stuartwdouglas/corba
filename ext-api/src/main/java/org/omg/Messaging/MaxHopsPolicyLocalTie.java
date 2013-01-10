package org.omg.Messaging;


/**
 * Generated from IDL interface "MaxHopsPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class MaxHopsPolicyLocalTie
	extends _MaxHopsPolicyLocalBase
{
	private MaxHopsPolicyOperations _delegate;

	public MaxHopsPolicyLocalTie(MaxHopsPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public MaxHopsPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaxHopsPolicyOperations delegate)
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

	public short max_hops()
	{
		return _delegate.max_hops();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
