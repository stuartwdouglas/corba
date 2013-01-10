package org.omg.dds;
/**
 * Generated from IDL enum "HistoryQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class HistoryQosPolicyKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _KEEP_LAST_HISTORY_QOS = 0;
	public static final HistoryQosPolicyKind KEEP_LAST_HISTORY_QOS = new HistoryQosPolicyKind(_KEEP_LAST_HISTORY_QOS);
	public static final int _KEEP_ALL_HISTORY_QOS = 1;
	public static final HistoryQosPolicyKind KEEP_ALL_HISTORY_QOS = new HistoryQosPolicyKind(_KEEP_ALL_HISTORY_QOS);
	public int value()
	{
		return value;
	}
	public static HistoryQosPolicyKind from_int(int value)
	{
		switch (value) {
			case _KEEP_LAST_HISTORY_QOS: return KEEP_LAST_HISTORY_QOS;
			case _KEEP_ALL_HISTORY_QOS: return KEEP_ALL_HISTORY_QOS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _KEEP_LAST_HISTORY_QOS: return "KEEP_LAST_HISTORY_QOS";
			case _KEEP_ALL_HISTORY_QOS: return "KEEP_ALL_HISTORY_QOS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HistoryQosPolicyKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
