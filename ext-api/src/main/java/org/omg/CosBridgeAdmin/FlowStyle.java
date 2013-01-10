package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "FlowStyle".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class FlowStyle
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PUSH = 0;
	public static final FlowStyle PUSH = new FlowStyle(_PUSH);
	public static final int _PULL = 1;
	public static final FlowStyle PULL = new FlowStyle(_PULL);
	public int value()
	{
		return value;
	}
	public static FlowStyle from_int(int value)
	{
		switch (value) {
			case _PUSH: return PUSH;
			case _PULL: return PULL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PUSH: return "PUSH";
			case _PULL: return "PULL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FlowStyle(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
