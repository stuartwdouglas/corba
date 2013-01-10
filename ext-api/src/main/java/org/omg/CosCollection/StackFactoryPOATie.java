package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "StackFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class StackFactoryPOATie
	extends StackFactoryPOA
{
	private StackFactoryOperations _delegate;

	private POA _poa;
	public StackFactoryPOATie(StackFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public StackFactoryPOATie(StackFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.StackFactory _this()
	{
		return org.omg.CosCollection.StackFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.StackFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.StackFactoryHelper.narrow(_this_object(orb));
	}
	public StackFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StackFactoryOperations delegate)
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
	public org.omg.CosCollection.Stack create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.RestrictedAccessCollection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
