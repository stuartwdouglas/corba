package org.omg.BridgeTransactionMgmt;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public class TransactionManagementPOATie
	extends TransactionManagementPOA
{
	private TransactionManagementOperations _delegate;

	private POA _poa;
	public TransactionManagementPOATie(TransactionManagementOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionManagementPOATie(TransactionManagementOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this()
	{
		return org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(_this_object());
	}
	public org.omg.BridgeTransactionMgmt.TransactionManagement _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.BridgeTransactionMgmt.TransactionManagementHelper.narrow(_this_object(orb));
	}
	public TransactionManagementOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionManagementOperations delegate)
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
	public void disable_transaction() throws org.omg.BridgeTransactionMgmt.TransactionActive
	{
_delegate.disable_transaction();
	}

	public void enable_transaction(int events, int timeout) throws org.omg.BridgeTransactionMgmt.TransactionAlreadyActive,org.omg.BridgeTransactionMgmt.UnsupportedTransaction
	{
_delegate.enable_transaction(events,timeout);
	}

}
