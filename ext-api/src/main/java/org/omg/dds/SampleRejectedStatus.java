package org.omg.dds;

/**
 * Generated from IDL struct "SampleRejectedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleRejectedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public SampleRejectedStatus(){}
	public int total_count;
	public int total_count_change;
	public org.omg.dds.SampleRejectedStatusKind last_reason;
	public int last_instance_handle;
	public SampleRejectedStatus(int total_count, int total_count_change, org.omg.dds.SampleRejectedStatusKind last_reason, int last_instance_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_reason = last_reason;
		this.last_instance_handle = last_instance_handle;
	}
}
