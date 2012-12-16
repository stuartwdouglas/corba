package org.omg.CORBA;


/**
 * Generated from IDL interface "ValueMemberDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public interface ValueMemberDefOperations
	extends org.omg.CORBA.ContainedOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode type();
	org.omg.CORBA.IDLType type_def();
	void type_def(org.omg.CORBA.IDLType arg);
	short access();
	void access(short arg);
}
