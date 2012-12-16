package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "KeySortedSetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class KeySortedSetFactoryPOATie
	extends KeySortedSetFactoryPOA
{
	private KeySortedSetFactoryOperations _delegate;

	private POA _poa;
	public KeySortedSetFactoryPOATie(KeySortedSetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public KeySortedSetFactoryPOATie(KeySortedSetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.KeySortedSetFactory _this()
	{
		return org.omg.CosCollection.KeySortedSetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.KeySortedSetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.KeySortedSetFactoryHelper.narrow(_this_object(orb));
	}
	public KeySortedSetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KeySortedSetFactoryOperations delegate)
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
	public org.omg.CosCollection.KeySortedSet create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
