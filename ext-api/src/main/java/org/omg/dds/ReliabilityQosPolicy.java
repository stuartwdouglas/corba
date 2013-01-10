package org.omg.dds;

/**
 * Generated from IDL struct "ReliabilityQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ReliabilityQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public ReliabilityQosPolicy(){}
	public org.omg.dds.ReliabilityQosPolicyKind kind;
	public org.omg.dds.Duration_t max_blocking_time;
	public ReliabilityQosPolicy(org.omg.dds.ReliabilityQosPolicyKind kind, org.omg.dds.Duration_t max_blocking_time)
	{
		this.kind = kind;
		this.max_blocking_time = max_blocking_time;
	}
}
