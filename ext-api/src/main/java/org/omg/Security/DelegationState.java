package org.omg.Security;
/**
 * Generated from IDL enum "DelegationState".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DelegationState
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecInitiator = 0;
	public static final DelegationState SecInitiator = new DelegationState(_SecInitiator);
	public static final int _SecDelegate = 1;
	public static final DelegationState SecDelegate = new DelegationState(_SecDelegate);
	public int value()
	{
		return value;
	}
	public static DelegationState from_int(int value)
	{
		switch (value) {
			case _SecInitiator: return SecInitiator;
			case _SecDelegate: return SecDelegate;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecInitiator: return "SecInitiator";
			case _SecDelegate: return "SecDelegate";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected DelegationState(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
