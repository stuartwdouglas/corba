package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynSequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public interface DynSequenceOperations
	extends org.omg.DynamicAny.DynAnyOperations
{
	/* constants */
	/* operations  */
	int get_length();
	void set_length(int len) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	org.omg.CORBA.Any[] get_elements();
	void set_elements(org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.DynAny[] get_elements_as_dyn_any();
	void set_elements_as_dyn_any(org.omg.DynamicAny.DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
}
