package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SortedRelationFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class SortedRelationFactoryPOATie
	extends SortedRelationFactoryPOA
{
	private SortedRelationFactoryOperations _delegate;

	private POA _poa;
	public SortedRelationFactoryPOATie(SortedRelationFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public SortedRelationFactoryPOATie(SortedRelationFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.SortedRelationFactory _this()
	{
		return org.omg.CosCollection.SortedRelationFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.SortedRelationFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.SortedRelationFactoryHelper.narrow(_this_object(orb));
	}
	public SortedRelationFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SortedRelationFactoryOperations delegate)
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
	public org.omg.CosCollection.SortedRelation create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
