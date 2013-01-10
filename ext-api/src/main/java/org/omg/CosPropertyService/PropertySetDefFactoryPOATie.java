package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public class PropertySetDefFactoryPOATie
	extends PropertySetDefFactoryPOA
{
	private PropertySetDefFactoryOperations _delegate;

	private POA _poa;
	public PropertySetDefFactoryPOATie(PropertySetDefFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertySetDefFactoryPOATie(PropertySetDefFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertySetDefFactory _this()
	{
		return org.omg.CosPropertyService.PropertySetDefFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetDefFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetDefFactoryHelper.narrow(_this_object(orb));
	}
	public PropertySetDefFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertySetDefFactoryOperations delegate)
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
	public org.omg.CosPropertyService.PropertySetDef create_initial_propertysetdef(org.omg.CosPropertyService.PropertyDef[] initial_property_defs) throws org.omg.CosPropertyService.MultipleExceptions
	{
		return _delegate.create_initial_propertysetdef(initial_property_defs);
	}

	public org.omg.CosPropertyService.PropertySetDef create_constrained_propertysetdef(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.PropertyDef[] allowed_property_defs) throws org.omg.CosPropertyService.ConstraintNotSupported
	{
		return _delegate.create_constrained_propertysetdef(allowed_property_types,allowed_property_defs);
	}

	public org.omg.CosPropertyService.PropertySetDef create_propertysetdef()
	{
		return _delegate.create_propertysetdef();
	}

}
