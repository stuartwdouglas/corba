package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertySetDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public class PropertySetDefPOATie
	extends PropertySetDefPOA
{
	private PropertySetDefOperations _delegate;

	private POA _poa;
	public PropertySetDefPOATie(PropertySetDefOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertySetDefPOATie(PropertySetDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertySetDef _this()
	{
		return org.omg.CosPropertyService.PropertySetDefHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySetDef _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetDefHelper.narrow(_this_object(orb));
	}
	public PropertySetDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertySetDefOperations delegate)
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
	public void define_property_with_mode(java.lang.String property_name, org.omg.CORBA.Any property_value, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.define_property_with_mode(property_name,property_value,property_mode);
	}

	public org.omg.CORBA.Any get_property_value(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		return _delegate.get_property_value(property_name);
	}

	public void set_property_modes(org.omg.CosPropertyService.PropertyMode[] property_modes) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.set_property_modes(property_modes);
	}

	public void delete_property(java.lang.String property_name) throws org.omg.CosPropertyService.FixedProperty,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.delete_property(property_name);
	}

	public boolean get_properties(java.lang.String[] property_names, org.omg.CosPropertyService.PropertiesHolder nproperties)
	{
		return _delegate.get_properties(property_names,nproperties);
	}

	public boolean get_property_modes(java.lang.String[] property_names, org.omg.CosPropertyService.PropertyModesHolder property_modes)
	{
		return _delegate.get_property_modes(property_names,property_modes);
	}

	public org.omg.CosPropertyService.PropertyModeType get_property_mode(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		return _delegate.get_property_mode(property_name);
	}

	public void set_property_mode(java.lang.String property_name, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.set_property_mode(property_name,property_mode);
	}

	public void delete_properties(java.lang.String[] property_names) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.delete_properties(property_names);
	}

	public void get_all_property_names(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names, org.omg.CosPropertyService.PropertyNamesIteratorHolder rest)
	{
_delegate.get_all_property_names(how_many,property_names,rest);
	}

	public void get_allowed_property_types(org.omg.CosPropertyService.PropertyTypesHolder property_types)
	{
_delegate.get_allowed_property_types(property_types);
	}

	public boolean delete_all_properties()
	{
		return _delegate.delete_all_properties();
	}

	public void define_property(java.lang.String property_name, org.omg.CORBA.Any property_value) throws org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.define_property(property_name,property_value);
	}

	public void define_properties_with_modes(org.omg.CosPropertyService.PropertyDef[] property_defs) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.define_properties_with_modes(property_defs);
	}

	public int get_number_of_properties()
	{
		return _delegate.get_number_of_properties();
	}

	public void get_all_properties(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties, org.omg.CosPropertyService.PropertiesIteratorHolder rest)
	{
_delegate.get_all_properties(how_many,nproperties,rest);
	}

	public boolean is_property_defined(java.lang.String property_name) throws org.omg.CosPropertyService.InvalidPropertyName
	{
		return _delegate.is_property_defined(property_name);
	}

	public void define_properties(org.omg.CosPropertyService.Property[] nproperties) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.define_properties(nproperties);
	}

	public void get_allowed_properties(org.omg.CosPropertyService.PropertyDefsHolder property_defs)
	{
_delegate.get_allowed_properties(property_defs);
	}

}
