package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public interface DynValueOperations
	extends org.omg.DynamicAny.DynAnyOperations
{
	/* constants */
	/* operations  */
	java.lang.String current_member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.CORBA.TCKind current_member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.NameValuePair[] get_members() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_members(org.omg.DynamicAny.NameValuePair[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	org.omg.DynamicAny.NameDynAnyPair[] get_members_as_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	void set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
}
