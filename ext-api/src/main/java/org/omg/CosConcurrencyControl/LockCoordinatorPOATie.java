package org.omg.CosConcurrencyControl;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "LockCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class LockCoordinatorPOATie
	extends LockCoordinatorPOA
{
	private LockCoordinatorOperations _delegate;

	private POA _poa;
	public LockCoordinatorPOATie(LockCoordinatorOperations delegate)
	{
		_delegate = delegate;
	}
	public LockCoordinatorPOATie(LockCoordinatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosConcurrencyControl.LockCoordinator _this()
	{
		return org.omg.CosConcurrencyControl.LockCoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosConcurrencyControl.LockCoordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosConcurrencyControl.LockCoordinatorHelper.narrow(_this_object(orb));
	}
	public LockCoordinatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LockCoordinatorOperations delegate)
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
	public void drop_locks()
	{
_delegate.drop_locks();
	}

}
