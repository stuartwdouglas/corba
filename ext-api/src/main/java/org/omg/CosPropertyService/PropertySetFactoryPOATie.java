package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public class PropertySetFactoryPOATie
	extends PropertySetFactoryPOA
{
	private PropertySetFactoryOperations _delegate;

	private POA _poa;
	public PropertySetFactoryPOATie(PropertySetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertySetFactoryPOATie(PropertySetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertySetFactory _this()
	{
		return org.omg.CosPropertyService.PropertySetFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetFactoryHelper.narrow(_this_object(orb));
	}
	public PropertySetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertySetFactoryOperations delegate)
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
	public org.omg.CosPropertyService.PropertySet create_propertyset()
	{
		return _delegate.create_propertyset();
	}

	public org.omg.CosPropertyService.PropertySet create_constrained_propertyset(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.Property[] allowed_properties) throws org.omg.CosPropertyService.ConstraintNotSupported
	{
		return _delegate.create_constrained_propertyset(allowed_property_types,allowed_properties);
	}

	public org.omg.CosPropertyService.PropertySet create_initial_propertyset(org.omg.CosPropertyService.Property[] initial_properties) throws org.omg.CosPropertyService.MultipleExceptions
	{
		return _delegate.create_initial_propertyset(initial_properties);
	}

}
