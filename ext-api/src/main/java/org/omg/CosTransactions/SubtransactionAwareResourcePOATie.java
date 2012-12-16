package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SubtransactionAwareResource".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class SubtransactionAwareResourcePOATie
	extends SubtransactionAwareResourcePOA
{
	private SubtransactionAwareResourceOperations _delegate;

	private POA _poa;
	public SubtransactionAwareResourcePOATie(SubtransactionAwareResourceOperations delegate)
	{
		_delegate = delegate;
	}
	public SubtransactionAwareResourcePOATie(SubtransactionAwareResourceOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.SubtransactionAwareResource _this()
	{
		return org.omg.CosTransactions.SubtransactionAwareResourceHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.SubtransactionAwareResource _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.SubtransactionAwareResourceHelper.narrow(_this_object(orb));
	}
	public SubtransactionAwareResourceOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SubtransactionAwareResourceOperations delegate)
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
	public void rollback_subtransaction()
	{
_delegate.rollback_subtransaction();
	}

	public void rollback() throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed,org.omg.CosTransactions.HeuristicCommit
	{
_delegate.rollback();
	}

	public void commit_subtransaction(org.omg.CosTransactions.Coordinator parent)
	{
_delegate.commit_subtransaction(parent);
	}

	public void commit() throws org.omg.CosTransactions.NotPrepared,org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed,org.omg.CosTransactions.HeuristicRollback
	{
_delegate.commit();
	}

	public org.omg.CosTransactions.Vote prepare() throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed
	{
		return _delegate.prepare();
	}

	public void commit_one_phase() throws org.omg.CosTransactions.HeuristicHazard
	{
_delegate.commit_one_phase();
	}

	public void forget()
	{
_delegate.forget();
	}

}