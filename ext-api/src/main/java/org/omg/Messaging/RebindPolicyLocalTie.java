package org.omg.Messaging;


/**
 * Generated from IDL interface "RebindPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class RebindPolicyLocalTie
	extends _RebindPolicyLocalBase
{
	private RebindPolicyOperations _delegate;

	public RebindPolicyLocalTie(RebindPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RebindPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RebindPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public short rebind_mode()
	{
		return _delegate.rebind_mode();
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
