package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Policy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class PolicyPOATie
	extends PolicyPOA
{
	private PolicyOperations _delegate;

	private POA _poa;
	public PolicyPOATie(PolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyPOATie(PolicyOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.Policy _this()
	{
		return org.omg.CORBA.PolicyHelper.narrow(_this_object());
	}
	public org.omg.CORBA.Policy _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.PolicyHelper.narrow(_this_object(orb));
	}
	public PolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
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
