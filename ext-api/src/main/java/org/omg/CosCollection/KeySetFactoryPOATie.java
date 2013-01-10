package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "KeySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class KeySetFactoryPOATie
	extends KeySetFactoryPOA
{
	private KeySetFactoryOperations _delegate;

	private POA _poa;
	public KeySetFactoryPOATie(KeySetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public KeySetFactoryPOATie(KeySetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.KeySetFactory _this()
	{
		return org.omg.CosCollection.KeySetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.KeySetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.KeySetFactoryHelper.narrow(_this_object(orb));
	}
	public KeySetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KeySetFactoryOperations delegate)
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
	public org.omg.CosCollection.KeySet create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
