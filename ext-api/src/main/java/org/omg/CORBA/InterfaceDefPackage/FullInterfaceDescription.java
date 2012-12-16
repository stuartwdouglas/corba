package org.omg.CORBA.InterfaceDefPackage;

/**
 * Generated from IDL struct "FullInterfaceDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class FullInterfaceDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	public FullInterfaceDescription(){}
	public java.lang.String name;
	public java.lang.String id;
	public java.lang.String defined_in;
	public java.lang.String version;
	public org.omg.CORBA.OperationDescription[] operations;
	public org.omg.CORBA.AttributeDescription[] attributes;
	public java.lang.String[] base_interfaces;
	public org.omg.CORBA.TypeCode type;
	public boolean is_abstract;
	public FullInterfaceDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version, org.omg.CORBA.OperationDescription[] operations, org.omg.CORBA.AttributeDescription[] attributes, java.lang.String[] base_interfaces, org.omg.CORBA.TypeCode type, boolean is_abstract)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
		this.operations = operations;
		this.attributes = attributes;
		this.base_interfaces = base_interfaces;
		this.type = type;
		this.is_abstract = is_abstract;
	}
}
