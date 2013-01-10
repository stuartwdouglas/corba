package org.omg.CosTransactions;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public class SynchronizationPOATie
	extends SynchronizationPOA
{
	private SynchronizationOperations _delegate;

	private POA _poa;
	public SynchronizationPOATie(SynchronizationOperations delegate)
	{
		_delegate = delegate;
	}
	public SynchronizationPOATie(SynchronizationOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTransactions.Synchronization _this()
	{
		return org.omg.CosTransactions.SynchronizationHelper.narrow(_this_object());
	}
	public org.omg.CosTransactions.Synchronization _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTransactions.SynchronizationHelper.narrow(_this_object(orb));
	}
	public SynchronizationOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SynchronizationOperations delegate)
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
	public void before_completion()
	{
_delegate.before_completion();
	}

	public void after_completion(org.omg.CosTransactions.Status status_)
	{
_delegate.after_completion(status_);
	}

}
