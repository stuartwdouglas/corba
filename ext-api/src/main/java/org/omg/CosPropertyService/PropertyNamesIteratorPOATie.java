package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertyNamesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public class PropertyNamesIteratorPOATie
	extends PropertyNamesIteratorPOA
{
	private PropertyNamesIteratorOperations _delegate;

	private POA _poa;
	public PropertyNamesIteratorPOATie(PropertyNamesIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertyNamesIteratorPOATie(PropertyNamesIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertyNamesIterator _this()
	{
		return org.omg.CosPropertyService.PropertyNamesIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertyNamesIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertyNamesIteratorHelper.narrow(_this_object(orb));
	}
	public PropertyNamesIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertyNamesIteratorOperations delegate)
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
	public boolean next_n(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names)
	{
		return _delegate.next_n(how_many,property_names);
	}

	public boolean next_one(org.omg.CORBA.StringHolder property_name)
	{
		return _delegate.next_one(property_name);
	}

	public void reset()
	{
_delegate.reset();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
