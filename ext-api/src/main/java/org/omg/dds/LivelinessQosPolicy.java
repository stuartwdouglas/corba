package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public LivelinessQosPolicy(){}
	public org.omg.dds.LivelinessQosPolicyKind kind;
	public org.omg.dds.Duration_t lease_duration;
	public LivelinessQosPolicy(org.omg.dds.LivelinessQosPolicyKind kind, org.omg.dds.Duration_t lease_duration)
	{
		this.kind = kind;
		this.lease_duration = lease_duration;
	}
}
