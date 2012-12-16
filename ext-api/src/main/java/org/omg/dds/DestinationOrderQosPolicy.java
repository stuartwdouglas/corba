package org.omg.dds;

/**
 * Generated from IDL struct "DestinationOrderQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DestinationOrderQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public DestinationOrderQosPolicy(){}
	public org.omg.dds.DestinationOrderQosPolicyKind kind;
	public DestinationOrderQosPolicy(org.omg.dds.DestinationOrderQosPolicyKind kind)
	{
		this.kind = kind;
	}
}
