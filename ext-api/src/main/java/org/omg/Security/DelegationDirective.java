package org.omg.Security;
/**
 * Generated from IDL enum "DelegationDirective".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class DelegationDirective
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _Delegate = 0;
	public static final DelegationDirective Delegate = new DelegationDirective(_Delegate);
	public static final int _NoDelegate = 1;
	public static final DelegationDirective NoDelegate = new DelegationDirective(_NoDelegate);
	public int value()
	{
		return value;
	}
	public static DelegationDirective from_int(int value)
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
	protected DelegationDirective(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
