package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SortedBagFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class SortedBagFactoryPOATie
	extends SortedBagFactoryPOA
{
	private SortedBagFactoryOperations _delegate;

	private POA _poa;
	public SortedBagFactoryPOATie(SortedBagFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public SortedBagFactoryPOATie(SortedBagFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SortedBagFactory _this()
	{
		return org.omg.CosCollection.SortedBagFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.SortedBagFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.SortedBagFactoryHelper.narrow(_this_object(orb));
	}
	public SortedBagFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SortedBagFactoryOperations delegate)
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
	public org.omg.CosCollection.SortedBag create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
