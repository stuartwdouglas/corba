package org.omg.BiDirPolicy;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BidirectionalPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public class BidirectionalPolicyPOATie
	extends BidirectionalPolicyPOA
{
	private BidirectionalPolicyOperations _delegate;

	private POA _poa;
	public BidirectionalPolicyPOATie(BidirectionalPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public BidirectionalPolicyPOATie(BidirectionalPolicyOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.BiDirPolicy.BidirectionalPolicy _this()
	{
		return org.omg.BiDirPolicy.BidirectionalPolicyHelper.narrow(_this_object());
	}
	public org.omg.BiDirPolicy.BidirectionalPolicy _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.BiDirPolicy.BidirectionalPolicyHelper.narrow(_this_object(orb));
	}
	public BidirectionalPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BidirectionalPolicyOperations delegate)
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
	public short value()
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
