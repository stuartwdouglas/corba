package org.omg.dds;

/**
 * Generated from IDL struct "InconsistentTopicStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class InconsistentTopicStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public InconsistentTopicStatus(){}
	public int total_count;
	public int total_count_change;
	public InconsistentTopicStatus(int total_count, int total_count_change)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
	}
}
