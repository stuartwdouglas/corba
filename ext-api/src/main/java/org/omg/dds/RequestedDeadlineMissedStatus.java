package org.omg.dds;

/**
 * Generated from IDL struct "RequestedDeadlineMissedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class RequestedDeadlineMissedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public RequestedDeadlineMissedStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_instance_handle;
	public RequestedDeadlineMissedStatus(int total_count, int total_count_change, int last_instance_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_instance_handle = last_instance_handle;
	}
}
