package org.omg.CosConcurrencyControl;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "LockSet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class LockSetPOATie
	extends LockSetPOA
{
	private LockSetOperations _delegate;

	private POA _poa;
	public LockSetPOATie(LockSetOperations delegate)
	{
		_delegate = delegate;
	}
	public LockSetPOATie(LockSetOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosConcurrencyControl.LockSet _this()
	{
		return org.omg.CosConcurrencyControl.LockSetHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.LockSet _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.LockSetHelper.narrow(_this_object(orb));
	}
	public LockSetOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LockSetOperations delegate)
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
	public void lock(org.omg.CosConcurrencyControl.lock_mode mode)
	{
_delegate.lock(mode);
	}

	public boolean try_lock(org.omg.CosConcurrencyControl.lock_mode mode)
	{
		return _delegate.try_lock(mode);
	}

	public org.omg.CosConcurrencyControl.LockCoordinator get_coordinator(org.omg.CosTransactions.Coordinator which)
	{
		return _delegate.get_coordinator(which);
	}

	public void change_mode(org.omg.CosConcurrencyControl.lock_mode held_mode, org.omg.CosConcurrencyControl.lock_mode new_mode) throws org.omg.CosConcurrencyControl.LockNotHeld
	{
_delegate.change_mode(held_mode,new_mode);
	}

	public void unlock(org.omg.CosConcurrencyControl.lock_mode mode) throws org.omg.CosConcurrencyControl.LockNotHeld
	{
_delegate.unlock(mode);
	}

}
