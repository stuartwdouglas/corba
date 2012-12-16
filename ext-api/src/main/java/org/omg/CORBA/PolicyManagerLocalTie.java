package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class PolicyManagerLocalTie
	extends _PolicyManagerLocalBase
{
	private PolicyManagerOperations _delegate;

	public PolicyManagerLocalTie(PolicyManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public void set_policy_overrides(org.omg.CORBA.Policy[] policies, org.omg.CORBA.SetOverrideType set_add) throws org.omg.CORBA.InvalidPolicies
	{
_delegate.set_policy_overrides(policies,set_add);
	}

	public org.omg.CORBA.Policy[] get_policy_overrides(int[] ts)
	{
		return _delegate.get_policy_overrides(ts);
	}

}
