package org.omg.dds;

/**
 * Generated from IDL struct "DeadlineQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DeadlineQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public DeadlineQosPolicy(){}
	public org.omg.dds.Duration_t period;
	public DeadlineQosPolicy(org.omg.dds.Duration_t period)
	{
		this.period = period;
	}
}
