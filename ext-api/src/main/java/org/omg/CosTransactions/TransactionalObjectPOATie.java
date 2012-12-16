package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionalObject".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class TransactionalObjectPOATie
	extends TransactionalObjectPOA
{
	private TransactionalObjectOperations _delegate;

	private POA _poa;
	public TransactionalObjectPOATie(TransactionalObjectOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionalObjectPOATie(TransactionalObjectOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.TransactionalObject _this()
	{
		return org.omg.CosTransactions.TransactionalObjectHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.TransactionalObject _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.TransactionalObjectHelper.narrow(_this_object(orb));
	}
	public TransactionalObjectOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionalObjectOperations delegate)
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
}
