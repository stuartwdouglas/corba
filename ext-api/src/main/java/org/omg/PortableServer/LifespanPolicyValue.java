package org.omg.PortableServer;
/**
 * Generated from IDL enum "LifespanPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class LifespanPolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TRANSIENT = 0;
	public static final LifespanPolicyValue TRANSIENT = new LifespanPolicyValue(_TRANSIENT);
	public static final int _PERSISTENT = 1;
	public static final LifespanPolicyValue PERSISTENT = new LifespanPolicyValue(_PERSISTENT);
	public int value()
	{
		return value;
	}
	public static LifespanPolicyValue from_int(int value)
	{
		switch (value) {
			case _TRANSIENT: return TRANSIENT;
			case _PERSISTENT: return PERSISTENT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TRANSIENT: return "TRANSIENT";
			case _PERSISTENT: return "PERSISTENT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LifespanPolicyValue(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
