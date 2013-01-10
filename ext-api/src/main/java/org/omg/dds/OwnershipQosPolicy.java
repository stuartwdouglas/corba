package org.omg.dds;

/**
 * Generated from IDL struct "OwnershipQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class OwnershipQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public OwnershipQosPolicy(){}
	public org.omg.dds.OwnershipQosPolicyKind kind;
	public OwnershipQosPolicy(org.omg.dds.OwnershipQosPolicyKind kind)
	{
		this.kind = kind;
	}
}
