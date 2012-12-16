package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySet".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public interface PropertySetOperations
{
	/* constants */
	/* operations  */
	void define_property(java.lang.String property_name, org.omg.CORBA.Any property_value) throws org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName;
	void define_properties(org.omg.CosPropertyService.Property[] nproperties) throws org.omg.CosPropertyService.MultipleExceptions;
	int get_number_of_properties();
	void get_all_property_names(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names, org.omg.CosPropertyService.PropertyNamesIteratorHolder rest);
	org.omg.CORBA.Any get_property_value(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName;
	boolean get_properties(java.lang.String[] property_names, org.omg.CosPropertyService.PropertiesHolder nproperties);
	void get_all_properties(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties, org.omg.CosPropertyService.PropertiesIteratorHolder rest);
	void delete_property(java.lang.String property_name) throws org.omg.CosPropertyService.FixedProperty,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName;
	void delete_properties(java.lang.String[] property_names) throws org.omg.CosPropertyService.MultipleExceptions;
	boolean delete_all_properties();
	boolean is_property_defined(java.lang.String property_name) throws org.omg.CosPropertyService.InvalidPropertyName;
}
