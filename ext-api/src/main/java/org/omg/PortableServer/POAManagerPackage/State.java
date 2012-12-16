package org.omg.PortableServer.POAManagerPackage;
/**
 * Generated from IDL enum "State".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class State
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _HOLDING = 0;
	public static final State HOLDING = new State(_HOLDING);
	public static final int _ACTIVE = 1;
	public static final State ACTIVE = new State(_ACTIVE);
	public static final int _DISCARDING = 2;
	public static final State DISCARDING = new State(_DISCARDING);
	public static final int _INACTIVE = 3;
	public static final State INACTIVE = new State(_INACTIVE);
	public int value()
	{
		return value;
	}
	public static State from_int(int value)
	{
		switch (value) {
			case _HOLDING: return HOLDING;
			case _ACTIVE: return ACTIVE;
			case _DISCARDING: return DISCARDING;
			case _INACTIVE: return INACTIVE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HOLDING: return "HOLDING";
			case _ACTIVE: return "ACTIVE";
			case _DISCARDING: return "DISCARDING";
			case _INACTIVE: return "INACTIVE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected State(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
