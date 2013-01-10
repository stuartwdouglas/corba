package org.omg.CORBA;


/**
 * Generated from IDL interface "Contained".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public interface ContainedOperations
	extends org.omg.CORBA.IRObjectOperations
{
	/* constants */
	/* operations  */
	java.lang.String id();
	void id(java.lang.String arg);
	java.lang.String name();
	void name(java.lang.String arg);
	java.lang.String version();
	void version(java.lang.String arg);
	org.omg.CORBA.Container defined_in();
	java.lang.String absolute_name();
	org.omg.CORBA.Repository containing_repository();
	org.omg.CORBA.ContainedPackage.Description describe();
	void move(org.omg.CORBA.Container new_container, java.lang.String new_name, java.lang.String new_version);
}
