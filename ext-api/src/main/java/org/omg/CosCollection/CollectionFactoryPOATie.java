package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class CollectionFactoryPOATie
	extends CollectionFactoryPOA
{
	private CollectionFactoryOperations _delegate;

	private POA _poa;
	public CollectionFactoryPOATie(CollectionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionFactoryPOATie(CollectionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.CollectionFactory _this()
	{
		return org.omg.CosCollection.CollectionFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.CollectionFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.CollectionFactoryHelper.narrow(_this_object(orb));
	}
	public CollectionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionFactoryOperations delegate)
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
	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
