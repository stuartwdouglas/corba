package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyCurrent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class PolicyCurrentLocalTie
	extends _PolicyCurrentLocalBase
{
	private PolicyCurrentOperations _delegate;

	public PolicyCurrentLocalTie(PolicyCurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyCurrentOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyCurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Policy[] get_policy_overrides(int[] ts)
	{
		return _delegate.get_policy_overrides(ts);
	}

	public void set_policy_overrides(org.omg.CORBA.Policy[] policies, org.omg.CORBA.SetOverrideType set_add) throws org.omg.CORBA.InvalidPolicies
	{
_delegate.set_policy_overrides(policies,set_add);
	}

}
