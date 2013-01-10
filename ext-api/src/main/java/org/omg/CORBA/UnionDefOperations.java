package org.omg.CORBA;


/**
 * Generated from IDL interface "UnionDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public interface UnionDefOperations
	extends org.omg.CORBA.TypedefDefOperations , org.omg.CORBA.ContainerOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode discriminator_type();
	org.omg.CORBA.IDLType discriminator_type_def();
	void discriminator_type_def(org.omg.CORBA.IDLType arg);
	org.omg.CORBA.UnionMember[] members();
	void members(org.omg.CORBA.UnionMember[] arg);
}
