package org.omg.dds;

/**
 * Generated from IDL struct "ResourceLimitsQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ResourceLimitsQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public ResourceLimitsQosPolicy(){}
	public int max_samples;
	public int max_instances;
	public int max_samples_per_instance;
	public ResourceLimitsQosPolicy(int max_samples, int max_instances, int max_samples_per_instance)
	{
		this.max_samples = max_samples;
		this.max_instances = max_instances;
		this.max_samples_per_instance = max_samples_per_instance;
	}
}
