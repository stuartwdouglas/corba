package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class RecoveryCoordinatorPOATie
	extends RecoveryCoordinatorPOA
{
	private RecoveryCoordinatorOperations _delegate;

	private POA _poa;
	public RecoveryCoordinatorPOATie(RecoveryCoordinatorOperations delegate)
	{
		_delegate = delegate;
	}
	public RecoveryCoordinatorPOATie(RecoveryCoordinatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.RecoveryCoordinator _this()
	{
		return org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.RecoveryCoordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.RecoveryCoordinatorHelper.narrow(_this_object(orb));
	}
	public RecoveryCoordinatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RecoveryCoordinatorOperations delegate)
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
	public org.omg.CosTransactions.Status replay_completion(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.NotPrepared
	{
		return _delegate.replay_completion(r);
	}

}
