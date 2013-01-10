package org.omg.CORBA;

/**
 * Generated from IDL struct "InterfaceDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class InterfaceDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	public InterfaceDescription(){}
	public java.lang.String name;
	public java.lang.String id;
	public java.lang.String defined_in;
	public java.lang.String version;
	public java.lang.String[] base_interfaces;
	public boolean is_abstract;
	public InterfaceDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version, java.lang.String[] base_interfaces, boolean is_abstract)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
		this.base_interfaces = base_interfaces;
		this.is_abstract = is_abstract;
	}
}
