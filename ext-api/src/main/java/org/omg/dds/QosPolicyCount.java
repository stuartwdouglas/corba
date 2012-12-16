package org.omg.dds;

/**
 * Generated from IDL struct "QosPolicyCount".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class QosPolicyCount
	implements org.omg.CORBA.portable.IDLEntity
{
	public QosPolicyCount(){}
	public int policy_id;
	public int count;
	public QosPolicyCount(int policy_id, int count)
	{
		this.policy_id = policy_id;
		this.count = count;
	}
}
