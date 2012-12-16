package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynAnyFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public interface DynAnyFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.DynamicAny.DynAny create_dyn_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
	org.omg.DynamicAny.DynAny create_dyn_any_from_type_code(org.omg.CORBA.TypeCode type) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
}
