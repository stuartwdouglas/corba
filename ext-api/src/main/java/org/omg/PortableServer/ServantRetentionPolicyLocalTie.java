package org.omg.PortableServer;


/**
 * Generated from IDL interface "ServantRetentionPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public class ServantRetentionPolicyLocalTie
	extends _ServantRetentionPolicyLocalBase
{
	private ServantRetentionPolicyOperations _delegate;

	public ServantRetentionPolicyLocalTie(ServantRetentionPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ServantRetentionPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServantRetentionPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.ServantRetentionPolicyValue value()
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
