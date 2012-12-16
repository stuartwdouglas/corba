package org.omg.CORBA.ContainedPackage;

/**
 * Generated from IDL struct "Description".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
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
