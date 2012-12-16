package org.omg.dds;

/**
 * Generated from IDL struct "LifespanQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LifespanQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public LifespanQosPolicy(){}
	public org.omg.dds.Duration_t duration;
	public LifespanQosPolicy(org.omg.dds.Duration_t duration)
	{
		this.duration = duration;
	}
}
