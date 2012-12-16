package org.omg.SecurityLevel2;
/**
 * Generated from IDL enum "DelegationMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DelegationMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _Delegate = 0;
	public static final DelegationMode Delegate = new DelegationMode(_Delegate);
	public static final int _NoDelegate = 1;
	public static final DelegationMode NoDelegate = new DelegationMode(_NoDelegate);
	public int value()
	{
		return value;
	}
	public static DelegationMode from_int(int value)
	{
		switch (value) {
			case _Delegate: return Delegate;
			case _NoDelegate: return NoDelegate;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _Delegate: return "Delegate";
			case _NoDelegate: return "NoDelegate";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected DelegationMode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
