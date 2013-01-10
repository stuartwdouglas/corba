package org.omg.CORBA.ContainerPackage;

/**
 * Generated from IDL struct "Description".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class Description
	implements org.omg.CORBA.portable.IDLEntity
{
	public Description(){}
	public org.omg.CORBA.Contained contained_object;
	public org.omg.CORBA.DefinitionKind kind;
	public org.omg.CORBA.Any value;
	public Description(org.omg.CORBA.Contained contained_object, org.omg.CORBA.DefinitionKind kind, org.omg.CORBA.Any value)
	{
		this.contained_object = contained_object;
		this.kind = kind;
		this.value = value;
	}
}
