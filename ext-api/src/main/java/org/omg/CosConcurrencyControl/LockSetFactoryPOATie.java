package org.omg.CosConcurrencyControl;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class LockSetFactoryPOATie
	extends LockSetFactoryPOA
{
	private LockSetFactoryOperations _delegate;

	private POA _poa;
	public LockSetFactoryPOATie(LockSetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public LockSetFactoryPOATie(LockSetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosConcurrencyControl.LockSetFactory _this()
	{
		return org.omg.CosConcurrencyControl.LockSetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.LockSetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.LockSetFactoryHelper.narrow(_this_object(orb));
	}
	public LockSetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LockSetFactoryOperations delegate)
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
	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional()
	{
		return _delegate.create_transactional();
	}

	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional_related(org.omg.CosConcurrencyControl.TransactionalLockSet which)
	{
		return _delegate.create_transactional_related(which);
	}

	public org.omg.CosConcurrencyControl.LockSet create_related(org.omg.CosConcurrencyControl.LockSet which)
	{
		return _delegate.create_related(which);
	}

	public org.omg.CosConcurrencyControl.LockSet create()
	{
		return _delegate.create();
	}

}
