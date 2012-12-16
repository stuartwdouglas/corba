package org.omg.CosPropertyService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PropertySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public class PropertySetPOATie
	extends PropertySetPOA
{
	private PropertySetOperations _delegate;

	private POA _poa;
	public PropertySetPOATie(PropertySetOperations delegate)
	{
		_delegate = delegate;
	}
	public PropertySetPOATie(PropertySetOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosPropertyService.PropertySet _this()
	{
		return org.omg.CosPropertyService.PropertySetHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertySet _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertySetHelper.narrow(_this_object(orb));
	}
	public PropertySetOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PropertySetOperations delegate)
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
	public void delete_properties(java.lang.String[] property_names) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.delete_properties(property_names);
	}

	public org.omg.CORBA.Any get_property_value(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		return _delegate.get_property_value(property_name);
	}

	public void delete_property(java.lang.String property_name) throws org.omg.CosPropertyService.FixedProperty,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.delete_property(property_name);
	}

	public void get_all_properties(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties, org.omg.CosPropertyService.PropertiesIteratorHolder rest)
	{
_delegate.get_all_properties(how_many,nproperties,rest);
	}

	public boolean is_property_defined(java.lang.String property_name) throws org.omg.CosPropertyService.InvalidPropertyName
	{
		return _delegate.is_property_defined(property_name);
	}

	public void get_all_property_names(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names, org.omg.CosPropertyService.PropertyNamesIteratorHolder rest)
	{
_delegate.get_all_property_names(how_many,property_names,rest);
	}

	public boolean get_properties(java.lang.String[] property_names, org.omg.CosPropertyService.PropertiesHolder nproperties)
	{
		return _delegate.get_properties(property_names,nproperties);
	}

	public void define_properties(org.omg.CosPropertyService.Property[] nproperties) throws org.omg.CosPropertyService.MultipleExceptions
	{
_delegate.define_properties(nproperties);
	}

	public void define_property(java.lang.String property_name, org.omg.CORBA.Any property_value) throws org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName
	{
_delegate.define_property(property_name,property_value);
	}

	public int get_number_of_properties()
	{
		return _delegate.get_number_of_properties();
	}

	public boolean delete_all_properties()
	{
		return _delegate.delete_all_properties();
	}

}
