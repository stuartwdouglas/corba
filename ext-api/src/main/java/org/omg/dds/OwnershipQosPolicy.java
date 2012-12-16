package org.omg.dds;

/**
 * Generated from IDL struct "OwnershipQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
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
