package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public interface PropertySetDefFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosPropertyService.PropertySetDef create_propertysetdef();
	org.omg.CosPropertyService.PropertySetDef create_constrained_propertysetdef(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.PropertyDef[] allowed_property_defs) throws org.omg.CosPropertyService.ConstraintNotSupported;
	org.omg.CosPropertyService.PropertySetDef create_initial_propertysetdef(org.omg.CosPropertyService.PropertyDef[] initial_property_defs) throws org.omg.CosPropertyService.MultipleExceptions;
}
