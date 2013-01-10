package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public class CurrentPOATie
	extends CurrentPOA
{
	private CurrentOperations _delegate;

	private POA _poa;
	public CurrentPOATie(CurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public CurrentPOATie(CurrentOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Current _this()
	{
		return org.omg.CosTransactions.CurrentHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Current _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.CurrentHelper.narrow(_this_object(orb));
	}
	public CurrentOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CurrentOperations delegate)
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
	public org.omg.CosTransactions.Control suspend()
	{
		return _delegate.suspend();
	}

	public org.omg.CosTransactions.Status get_status()
	{
		return _delegate.get_status();
	}

	public void rollback() throws org.omg.CosTransactions.NoTransaction
	{
_delegate.rollback();
	}

	public void resume(org.omg.CosTransactions.Control which) throws org.omg.CosTransactions.InvalidControl
	{
_delegate.resume(which);
	}

	public java.lang.String get_transaction_name()
	{
		return _delegate.get_transaction_name();
	}

	public void set_timeout(int seconds)
	{
_delegate.set_timeout(seconds);
	}

	public void commit(boolean report_heuristics) throws org.omg.CosTransactions.NoTransaction,org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed
	{
_delegate.commit(report_heuristics);
	}

	public void rollback_only() throws org.omg.CosTransactions.NoTransaction
	{
_delegate.rollback_only();
	}

	public org.omg.CosTransactions.Control get_control()
	{
		return _delegate.get_control();
	}

	public void begin() throws org.omg.CosTransactions.SubtransactionsUnavailable
	{
_delegate.begin();
	}

}
