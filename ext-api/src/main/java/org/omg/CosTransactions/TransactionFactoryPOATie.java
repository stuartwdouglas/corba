package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public class TransactionFactoryPOATie
	extends TransactionFactoryPOA
{
	private TransactionFactoryOperations _delegate;

	private POA _poa;
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.TransactionFactory _this()
	{
		return org.omg.CosTransactions.TransactionFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.TransactionFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.TransactionFactoryHelper.narrow(_this_object(orb));
	}
	public TransactionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionFactoryOperations delegate)
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
	public org.omg.CosTransactions.Control create(int time_out)
	{
		return _delegate.create(time_out);
	}

	public org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx)
	{
		return _delegate.recreate(ctx);
	}

}
