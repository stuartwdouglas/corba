package org.omg.CORBA;


/**
 * Generated from IDL interface "InterfaceDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public interface InterfaceDefOperations
	extends org.omg.CORBA.ContainerOperations , org.omg.CORBA.ContainedOperations , org.omg.CORBA.IDLTypeOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.InterfaceDef[] base_interfaces();
	void base_interfaces(org.omg.CORBA.InterfaceDef[] arg);
	boolean is_abstract();
	void is_abstract(boolean arg);
	boolean is_a(java.lang.String interface_id);
	org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription describe_interface();
	org.omg.CORBA.AttributeDef create_attribute(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode);
	org.omg.CORBA.OperationDef create_operation(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, java.lang.String[] contexts);
}
