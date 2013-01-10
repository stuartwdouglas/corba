package org.omg.dds;
/**
 * Generated from IDL enum "ReliabilityQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ReliabilityQosPolicyKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _BEST_EFFORT_RELIABILITY_QOS = 0;
	public static final ReliabilityQosPolicyKind BEST_EFFORT_RELIABILITY_QOS = new ReliabilityQosPolicyKind(_BEST_EFFORT_RELIABILITY_QOS);
	public static final int _RELIABLE_RELIABILITY_QOS = 1;
	public static final ReliabilityQosPolicyKind RELIABLE_RELIABILITY_QOS = new ReliabilityQosPolicyKind(_RELIABLE_RELIABILITY_QOS);
	public int value()
	{
		return value;
	}
	public static ReliabilityQosPolicyKind from_int(int value)
	{
		switch (value) {
			case _BEST_EFFORT_RELIABILITY_QOS: return BEST_EFFORT_RELIABILITY_QOS;
			case _RELIABLE_RELIABILITY_QOS: return RELIABLE_RELIABILITY_QOS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _BEST_EFFORT_RELIABILITY_QOS: return "BEST_EFFORT_RELIABILITY_QOS";
			case _RELIABLE_RELIABILITY_QOS: return "RELIABLE_RELIABILITY_QOS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ReliabilityQosPolicyKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
