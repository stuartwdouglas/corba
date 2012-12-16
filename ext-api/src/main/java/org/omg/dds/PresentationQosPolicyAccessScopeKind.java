package org.omg.dds;
/**
 * Generated from IDL enum "PresentationQosPolicyAccessScopeKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class PresentationQosPolicyAccessScopeKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _INSTANCE_PRESENTATION_QOS = 0;
	public static final PresentationQosPolicyAccessScopeKind INSTANCE_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind(_INSTANCE_PRESENTATION_QOS);
	public static final int _TOPIC_PRESENTATION_QOS = 1;
	public static final PresentationQosPolicyAccessScopeKind TOPIC_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind(_TOPIC_PRESENTATION_QOS);
	public static final int _GROUP_PRESENTATION_QOS = 2;
	public static final PresentationQosPolicyAccessScopeKind GROUP_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind(_GROUP_PRESENTATION_QOS);
	public int value()
	{
		return value;
	}
	public static PresentationQosPolicyAccessScopeKind from_int(int value)
	{
		switch (value) {
			case _INSTANCE_PRESENTATION_QOS: return INSTANCE_PRESENTATION_QOS;
			case _TOPIC_PRESENTATION_QOS: return TOPIC_PRESENTATION_QOS;
			case _GROUP_PRESENTATION_QOS: return GROUP_PRESENTATION_QOS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _INSTANCE_PRESENTATION_QOS: return "INSTANCE_PRESENTATION_QOS";
			case _TOPIC_PRESENTATION_QOS: return "TOPIC_PRESENTATION_QOS";
			case _GROUP_PRESENTATION_QOS: return "GROUP_PRESENTATION_QOS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PresentationQosPolicyAccessScopeKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
