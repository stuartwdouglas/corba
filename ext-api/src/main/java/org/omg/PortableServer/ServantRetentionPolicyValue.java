package org.omg.PortableServer;
/**
 * Generated from IDL enum "ServantRetentionPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ServantRetentionPolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _RETAIN = 0;
	public static final ServantRetentionPolicyValue RETAIN = new ServantRetentionPolicyValue(_RETAIN);
	public static final int _NON_RETAIN = 1;
	public static final ServantRetentionPolicyValue NON_RETAIN = new ServantRetentionPolicyValue(_NON_RETAIN);
	public int value()
	{
		return value;
	}
	public static ServantRetentionPolicyValue from_int(int value)
	{
		switch (value) {
			case _RETAIN: return RETAIN;
			case _NON_RETAIN: return NON_RETAIN;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _RETAIN: return "RETAIN";
			case _NON_RETAIN: return "NON_RETAIN";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ServantRetentionPolicyValue(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
