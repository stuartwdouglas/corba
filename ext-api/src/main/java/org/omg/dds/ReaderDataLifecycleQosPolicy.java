package org.omg.dds;

/**
 * Generated from IDL struct "ReaderDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ReaderDataLifecycleQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public ReaderDataLifecycleQosPolicy(){}
	public org.omg.dds.Duration_t autopurge_nowriter_samples_delay;
	public ReaderDataLifecycleQosPolicy(org.omg.dds.Duration_t autopurge_nowriter_samples_delay)
	{
		this.autopurge_nowriter_samples_delay = autopurge_nowriter_samples_delay;
	}
}
