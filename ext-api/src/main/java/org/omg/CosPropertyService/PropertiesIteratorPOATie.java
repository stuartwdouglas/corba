package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertiesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public class PropertiesIteratorPOATie
	extends PropertiesIteratorPOA
{
	private PropertiesIteratorOperations _delegate;

	private POA _poa;
	public PropertiesIteratorPOATie(PropertiesIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertiesIteratorPOATie(PropertiesIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertiesIterator _this()
	{
		return org.omg.CosPropertyService.PropertiesIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertiesIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertiesIteratorHelper.narrow(_this_object(orb));
	}
	public PropertiesIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertiesIteratorOperations delegate)
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
	public boolean next_n(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties)
	{
		return _delegate.next_n(how_many,nproperties);
	}

	public boolean next_one(org.omg.CosPropertyService.PropertyHolder aproperty)
	{
		return _delegate.next_one(aproperty);
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
