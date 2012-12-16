package org.omg.dds;

/**
 * Generated from IDL struct "RequestedIncompatibleQosStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class RequestedIncompatibleQosStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public RequestedIncompatibleQosStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_policy_id;
	public org.omg.dds.QosPolicyCount[] policies;
	public RequestedIncompatibleQosStatus(int total_count, int total_count_change, int last_policy_id, org.omg.dds.QosPolicyCount[] policies)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_policy_id = last_policy_id;
		this.policies = policies;
	}
}
