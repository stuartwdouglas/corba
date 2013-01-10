package org.omg.dds;
/**
 * Generated from IDL enum "SampleRejectedStatusKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleRejectedStatusKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _REJECTED_BY_INSTANCE_LIMIT = 0;
	public static final SampleRejectedStatusKind REJECTED_BY_INSTANCE_LIMIT = new SampleRejectedStatusKind(_REJECTED_BY_INSTANCE_LIMIT);
	public static final int _REJECTED_BY_TOPIC_LIMIT = 1;
	public static final SampleRejectedStatusKind REJECTED_BY_TOPIC_LIMIT = new SampleRejectedStatusKind(_REJECTED_BY_TOPIC_LIMIT);
	public int value()
	{
		return value;
	}
	public static SampleRejectedStatusKind from_int(int value)
	{
		switch (value) {
			case _REJECTED_BY_INSTANCE_LIMIT: return REJECTED_BY_INSTANCE_LIMIT;
			case _REJECTED_BY_TOPIC_LIMIT: return REJECTED_BY_TOPIC_LIMIT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _REJECTED_BY_INSTANCE_LIMIT: return "REJECTED_BY_INSTANCE_LIMIT";
			case _REJECTED_BY_TOPIC_LIMIT: return "REJECTED_BY_TOPIC_LIMIT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SampleRejectedStatusKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
