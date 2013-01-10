package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Terminator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public class TerminatorPOATie
	extends TerminatorPOA
{
	private TerminatorOperations _delegate;

	private POA _poa;
	public TerminatorPOATie(TerminatorOperations delegate)
	{
		_delegate = delegate;
	}
	public TerminatorPOATie(TerminatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Terminator _this()
	{
		return org.omg.CosTransactions.TerminatorHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Terminator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.TerminatorHelper.narrow(_this_object(orb));
	}
	public TerminatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TerminatorOperations delegate)
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
	public void rollback()
	{
_delegate.rollback();
	}

	public void commit(boolean report_heuristics) throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed
	{
_delegate.commit(report_heuristics);
	}

}
