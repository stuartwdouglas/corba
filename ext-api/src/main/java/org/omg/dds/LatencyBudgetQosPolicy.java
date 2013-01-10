package org.omg.dds;

/**
 * Generated from IDL struct "LatencyBudgetQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class LatencyBudgetQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public LatencyBudgetQosPolicy(){}
	public org.omg.dds.Duration_t duration;
	public LatencyBudgetQosPolicy(org.omg.dds.Duration_t duration)
	{
		this.duration = duration;
	}
}
