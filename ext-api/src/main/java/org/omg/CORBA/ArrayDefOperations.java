package org.omg.CORBA;


/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public interface ArrayDefOperations
	extends org.omg.CORBA.IDLTypeOperations
{
	/* constants */
	/* operations  */
	int length();
	void length(int arg);
	org.omg.CORBA.TypeCode element_type();
	org.omg.CORBA.IDLType element_type_def();
	void element_type_def(org.omg.CORBA.IDLType arg);
}
