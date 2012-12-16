package org.omg.CORBA;


/**
 * Generated from IDL interface "ValueDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public interface ValueDefOperations
	extends org.omg.CORBA.ContainerOperations , org.omg.CORBA.ContainedOperations , org.omg.CORBA.IDLTypeOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.InterfaceDef[] supported_interfaces();
	void supported_interfaces(org.omg.CORBA.InterfaceDef[] arg);
	org.omg.CORBA.Initializer[] initializers();
	void initializers(org.omg.CORBA.Initializer[] arg);
	org.omg.CORBA.ValueDef base_value();
	void base_value(org.omg.CORBA.ValueDef arg);
	org.omg.CORBA.ValueDef[] abstract_base_values();
	void abstract_base_values(org.omg.CORBA.ValueDef[] arg);
	boolean is_abstract();
	void is_abstract(boolean arg);
	boolean is_custom();
	void is_custom(boolean arg);
	boolean is_truncatable();
	void is_truncatable(boolean arg);
	boolean is_a(java.lang.String id);
	org.omg.CORBA.ValueDefPackage.FullValueDescription describe_value();
	org.omg.CORBA.ValueMemberDef create_value_member(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, short access);
	org.omg.CORBA.AttributeDef create_attribute(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode);
	org.omg.CORBA.OperationDef create_operation(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, java.lang.String[] contexts);
}
