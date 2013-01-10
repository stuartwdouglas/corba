package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public interface PropertySetDefOperations
	extends org.omg.CosPropertyService.PropertySetOperations
{
	/* constants */
	/* operations  */
	void get_allowed_property_types(org.omg.CosPropertyService.PropertyTypesHolder property_types);
	void get_allowed_properties(org.omg.CosPropertyService.PropertyDefsHolder property_defs);
	void define_property_with_mode(java.lang.String property_name, org.omg.CORBA.Any property_value, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName;
	void define_properties_with_modes(org.omg.CosPropertyService.PropertyDef[] property_defs) throws org.omg.CosPropertyService.MultipleExceptions;
	org.omg.CosPropertyService.PropertyModeType get_property_mode(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName;
	boolean get_property_modes(java.lang.String[] property_names, org.omg.CosPropertyService.PropertyModesHolder property_modes);
	void set_property_mode(java.lang.String property_name, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName;
	void set_property_modes(org.omg.CosPropertyService.PropertyMode[] property_modes) throws org.omg.CosPropertyService.MultipleExceptions;
}
