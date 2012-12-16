package org.omg.dds;

/**
 * Generated from IDL struct "HistoryQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class HistoryQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public HistoryQosPolicy(){}
	public org.omg.dds.HistoryQosPolicyKind kind;
	public int depth;
	public HistoryQosPolicy(org.omg.dds.HistoryQosPolicyKind kind, int depth)
	{
		this.kind = kind;
		this.depth = depth;
	}
}
