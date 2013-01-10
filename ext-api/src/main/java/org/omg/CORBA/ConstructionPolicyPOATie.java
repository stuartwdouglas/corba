package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ConstructionPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public class ConstructionPolicyPOATie
	extends ConstructionPolicyPOA
{
	private ConstructionPolicyOperations _delegate;

	private POA _poa;
	public ConstructionPolicyPOATie(ConstructionPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ConstructionPolicyPOATie(ConstructionPolicyOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.ConstructionPolicy _this()
	{
		return org.omg.CORBA.ConstructionPolicyHelper.narrow(_this_object());
	}
	public org.omg.CORBA.ConstructionPolicy _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CORBA.ConstructionPolicyHelper.narrow(_this_object(orb));
	}
	public ConstructionPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConstructionPolicyOperations delegate)
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

	public void make_domain_manager(org.omg.CORBA.InterfaceDef object_type, boolean constr_policy)
	{
_delegate.make_domain_manager(object_type,constr_policy);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
