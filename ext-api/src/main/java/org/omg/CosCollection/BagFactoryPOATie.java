package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "BagFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class BagFactoryPOATie
	extends BagFactoryPOA
{
	private BagFactoryOperations _delegate;

	private POA _poa;
	public BagFactoryPOATie(BagFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public BagFactoryPOATie(BagFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.BagFactory _this()
	{
		return org.omg.CosCollection.BagFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.BagFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.BagFactoryHelper.narrow(_this_object(orb));
	}
	public BagFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BagFactoryOperations delegate)
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
	public org.omg.CosCollection.Bag create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
