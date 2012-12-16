package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Coordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class CoordinatorPOATie
	extends CoordinatorPOA
{
	private CoordinatorOperations _delegate;

	private POA _poa;
	public CoordinatorPOATie(CoordinatorOperations delegate)
	{
		_delegate = delegate;
	}
	public CoordinatorPOATie(CoordinatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Coordinator _this()
	{
		return org.omg.CosTransactions.CoordinatorHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Coordinator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.CoordinatorHelper.narrow(_this_object(orb));
	}
	public CoordinatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CoordinatorOperations delegate)
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
	public boolean is_ancestor_transaction(org.omg.CosTransactions.Coordinator tc)
	{
		return _delegate.is_ancestor_transaction(tc);
	}

	public org.omg.CosTransactions.Status get_status()
	{
		return _delegate.get_status();
	}

	public boolean is_descendant_transaction(org.omg.CosTransactions.Coordinator tc)
	{
		return _delegate.is_descendant_transaction(tc);
	}

	public java.lang.String get_transaction_name()
	{
		return _delegate.get_transaction_name();
	}

	public org.omg.CosTransactions.Status get_top_level_status()
	{
		return _delegate.get_top_level_status();
	}

	public org.omg.CosTransactions.Status get_parent_status()
	{
		return _delegate.get_parent_status();
	}

	public void rollback_only() throws org.omg.CosTransactions.Inactive
	{
_delegate.rollback_only();
	}

	public boolean is_top_level_transaction()
	{
		return _delegate.is_top_level_transaction();
	}

	public org.omg.CosTransactions.Control create_subtransaction() throws org.omg.CosTransactions.SubtransactionsUnavailable,org.omg.CosTransactions.Inactive
	{
		return _delegate.create_subtransaction();
	}

	public org.omg.CosTransactions.PropagationContext get_txcontext() throws org.omg.CosTransactions.Unavailable
	{
		return _delegate.get_txcontext();
	}

	public void register_synchronization(org.omg.CosTransactions.Synchronization sync) throws org.omg.CosTransactions.SynchronizationUnavailable,org.omg.CosTransactions.Inactive
	{
_delegate.register_synchronization(sync);
	}

	public int hash_top_level_tran()
	{
		return _delegate.hash_top_level_tran();
	}

	public boolean is_same_transaction(org.omg.CosTransactions.Coordinator tc)
	{
		return _delegate.is_same_transaction(tc);
	}

	public void register_subtran_aware(org.omg.CosTransactions.SubtransactionAwareResource r) throws org.omg.CosTransactions.NotSubtransaction,org.omg.CosTransactions.Inactive
	{
_delegate.register_subtran_aware(r);
	}

	public int hash_transaction()
	{
		return _delegate.hash_transaction();
	}

	public org.omg.CosTransactions.RecoveryCoordinator register_resource(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.Inactive
	{
		return _delegate.register_resource(r);
	}

	public boolean is_related_transaction(org.omg.CosTransactions.Coordinator tc)
	{
		return _delegate.is_related_transaction(tc);
	}

}
