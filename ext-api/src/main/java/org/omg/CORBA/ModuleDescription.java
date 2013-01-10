package org.omg.CORBA;

/**
 * Generated from IDL struct "ModuleDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ModuleDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	public ModuleDescription(){}
	public java.lang.String name;
	public java.lang.String id;
	public java.lang.String defined_in;
	public java.lang.String version;
	public ModuleDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
	}
}
