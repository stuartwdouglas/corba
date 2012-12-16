package org.omg.dds;

/**
 * Generated from IDL struct "PresentationQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PresentationQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	public PresentationQosPolicy(){}
	public org.omg.dds.PresentationQosPolicyAccessScopeKind access_scope;
	public boolean coherent_access;
	public boolean ordered_access;
	public PresentationQosPolicy(org.omg.dds.PresentationQosPolicyAccessScopeKind access_scope, boolean coherent_access, boolean ordered_access)
	{
		this.access_scope = access_scope;
		this.coherent_access = coherent_access;
		this.ordered_access = ordered_access;
	}
}
