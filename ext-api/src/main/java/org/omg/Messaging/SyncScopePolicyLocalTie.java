package org.omg.Messaging;


/**
 * Generated from IDL interface "SyncScopePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class SyncScopePolicyLocalTie
	extends _SyncScopePolicyLocalBase
{
	private SyncScopePolicyOperations _delegate;

	public SyncScopePolicyLocalTie(SyncScopePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public SyncScopePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SyncScopePolicyOperations delegate)
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

	public short synchronization()
	{
		return _delegate.synchronization();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
