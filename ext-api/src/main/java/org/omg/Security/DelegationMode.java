package org.omg.Security;
/**
 * Generated from IDL enum "DelegationMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class DelegationMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecDelModeNoDelegation = 0;
	public static final DelegationMode SecDelModeNoDelegation = new DelegationMode(_SecDelModeNoDelegation);
	public static final int _SecDelModeSimpleDelegation = 1;
	public static final DelegationMode SecDelModeSimpleDelegation = new DelegationMode(_SecDelModeSimpleDelegation);
	public static final int _SecDelModeCompositeDelegation = 2;
	public static final DelegationMode SecDelModeCompositeDelegation = new DelegationMode(_SecDelModeCompositeDelegation);
	public int value()
	{
		return value;
	}
	public static DelegationMode from_int(int value)
	{
		switch (value) {
			case _SecDelModeNoDelegation: return SecDelModeNoDelegation;
			case _SecDelModeSimpleDelegation: return SecDelModeSimpleDelegation;
			case _SecDelModeCompositeDelegation: return SecDelModeCompositeDelegation;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecDelModeNoDelegation: return "SecDelModeNoDelegation";
			case _SecDelModeSimpleDelegation: return "SecDelModeSimpleDelegation";
			case _SecDelModeCompositeDelegation: return "SecDelModeCompositeDelegation";
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
