package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Comparator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class ComparatorPOATie
	extends ComparatorPOA
{
	private ComparatorOperations _delegate;

	private POA _poa;
	public ComparatorPOATie(ComparatorOperations delegate)
	{
		_delegate = delegate;
	}
	public ComparatorPOATie(ComparatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.Comparator _this()
	{
		return org.omg.CosCollection.ComparatorHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Comparator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.ComparatorHelper.narrow(_this_object(orb));
	}
	public ComparatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ComparatorOperations delegate)
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
	public int compare(org.omg.CORBA.Any element1, org.omg.CORBA.Any element2)
	{
		return _delegate.compare(element1,element2);
	}

}
