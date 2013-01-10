package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public interface PropertySetFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosPropertyService.PropertySet create_propertyset();
	org.omg.CosPropertyService.PropertySet create_constrained_propertyset(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.Property[] allowed_properties) throws org.omg.CosPropertyService.ConstraintNotSupported;
	org.omg.CosPropertyService.PropertySet create_initial_propertyset(org.omg.CosPropertyService.Property[] initial_properties) throws org.omg.CosPropertyService.MultipleExceptions;
}
