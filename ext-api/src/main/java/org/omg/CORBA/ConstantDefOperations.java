package org.omg.CORBA;


/**
 * Generated from IDL interface "ConstantDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public interface ConstantDefOperations
	extends org.omg.CORBA.ContainedOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode type();
	org.omg.CORBA.IDLType type_def();
	void type_def(org.omg.CORBA.IDLType arg);
	org.omg.CORBA.Any value();
	void value(org.omg.CORBA.Any arg);
}
