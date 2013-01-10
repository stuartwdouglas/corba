package org.omg.CORBA.ContainedPackage;

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
	public org.omg.CORBA.DefinitionKind kind;
	public org.omg.CORBA.Any value;
	public Description(org.omg.CORBA.DefinitionKind kind, org.omg.CORBA.Any value)
	{
		this.kind = kind;
		this.value = value;
	}
}
