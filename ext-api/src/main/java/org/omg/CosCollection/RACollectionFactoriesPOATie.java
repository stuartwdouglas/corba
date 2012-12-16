package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RACollectionFactories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class RACollectionFactoriesPOATie
	extends RACollectionFactoriesPOA
{
	private RACollectionFactoriesOperations _delegate;

	private POA _poa;
	public RACollectionFactoriesPOATie(RACollectionFactoriesOperations delegate)
	{
		_delegate = delegate;
	}
	public RACollectionFactoriesPOATie(RACollectionFactoriesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.RACollectionFactories _this()
	{
		return org.omg.CosCollection.RACollectionFactoriesHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.RACollectionFactories _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.RACollectionFactoriesHelper.narrow(_this_object(orb));
	}
	public RACollectionFactoriesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RACollectionFactoriesOperations delegate)
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
	public org.omg.CosCollection.RestrictedAccessCollection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

	public org.omg.CosCollection.Collection create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.create(parameters);
	}

	public boolean remove_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface)
	{
		return _delegate.remove_factory(collection_interface,impl_category,impl_interface);
	}

	public boolean add_factory(java.lang.String collection_interface, java.lang.String impl_category, java.lang.String impl_interface, org.omg.CosCollection.RACollectionFactory factory)
	{
		return _delegate.add_factory(collection_interface,impl_category,impl_interface,factory);
	}

}
