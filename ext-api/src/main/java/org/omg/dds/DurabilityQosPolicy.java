package org.omg.dds;

/**
 * Generated from IDL struct "DurabilityQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DurabilityQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public DurabilityQosPolicy(){}
	public org.omg.dds.DurabilityQosPolicyKind kind;
	public org.omg.dds.Duration_t service_cleanup_delay;
	public DurabilityQosPolicy(org.omg.dds.DurabilityQosPolicyKind kind, org.omg.dds.Duration_t service_cleanup_delay)
	{
		this.kind = kind;
		this.service_cleanup_delay = service_cleanup_delay;
	}
}
