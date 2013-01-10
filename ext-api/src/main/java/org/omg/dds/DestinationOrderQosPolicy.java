package org.omg.dds;

/**
 * Generated from IDL struct "DestinationOrderQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
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
