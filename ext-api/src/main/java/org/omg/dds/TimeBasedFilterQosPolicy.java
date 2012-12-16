package org.omg.dds;

/**
 * Generated from IDL struct "TimeBasedFilterQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class TimeBasedFilterQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public TimeBasedFilterQosPolicy(){}
	public org.omg.dds.Duration_t minimum_separation;
	public TimeBasedFilterQosPolicy(org.omg.dds.Duration_t minimum_separation)
	{
		this.minimum_separation = minimum_separation;
	}
}
