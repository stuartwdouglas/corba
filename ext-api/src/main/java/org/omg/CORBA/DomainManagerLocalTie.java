package org.omg.CORBA;


/**
 * Generated from IDL interface "DomainManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class DomainManagerLocalTie
	extends _DomainManagerLocalBase
{
	private DomainManagerOperations _delegate;

	public DomainManagerLocalTie(DomainManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public DomainManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DomainManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Policy get_domain_policy(int policy_type)
	{
		return _delegate.get_domain_policy(policy_type);
	}

}
