package org.omg.CORBA.ValueDefPackage;

/**
 * Generated from IDL struct "FullValueDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class FullValueDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	public FullValueDescription(){}
	public java.lang.String name;
	public java.lang.String id;
	public boolean is_abstract;
	public boolean is_custom;
	public java.lang.String defined_in;
	public java.lang.String version;
	public org.omg.CORBA.OperationDescription[] operations;
	public org.omg.CORBA.AttributeDescription[] attributes;
	public org.omg.CORBA.ValueMember[] members;
	public org.omg.CORBA.Initializer[] initializers;
	public java.lang.String[] supported_interfaces;
	public java.lang.String[] abstract_base_values;
	public boolean is_truncatable;
	public java.lang.String base_value;
	public org.omg.CORBA.TypeCode type;
	public FullValueDescription(java.lang.String name, java.lang.String id, boolean is_abstract, boolean is_custom, java.lang.String defined_in, java.lang.String version, org.omg.CORBA.OperationDescription[] operations, org.omg.CORBA.AttributeDescription[] attributes, org.omg.CORBA.ValueMember[] members, org.omg.CORBA.Initializer[] initializers, java.lang.String[] supported_interfaces, java.lang.String[] abstract_base_values, boolean is_truncatable, java.lang.String base_value, org.omg.CORBA.TypeCode type)
	{
		this.name = name;
		this.id = id;
		this.is_abstract = is_abstract;
		this.is_custom = is_custom;
		this.defined_in = defined_in;
		this.version = version;
		this.operations = operations;
		this.attributes = attributes;
		this.members = members;
		this.initializers = initializers;
		this.supported_interfaces = supported_interfaces;
		this.abstract_base_values = abstract_base_values;
		this.is_truncatable = is_truncatable;
		this.base_value = base_value;
		this.type = type;
	}
}
