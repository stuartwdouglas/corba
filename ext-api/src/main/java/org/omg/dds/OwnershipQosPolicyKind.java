package org.omg.dds;
/**
 * Generated from IDL enum "OwnershipQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class OwnershipQosPolicyKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SHARED_OWNERSHIP_QOS = 0;
	public static final OwnershipQosPolicyKind SHARED_OWNERSHIP_QOS = new OwnershipQosPolicyKind(_SHARED_OWNERSHIP_QOS);
	public static final int _EXCLUSIVE_OWNERSHIP_QOS = 1;
	public static final OwnershipQosPolicyKind EXCLUSIVE_OWNERSHIP_QOS = new OwnershipQosPolicyKind(_EXCLUSIVE_OWNERSHIP_QOS);
	public int value()
	{
		return value;
	}
	public static OwnershipQosPolicyKind from_int(int value)
	{
		switch (value) {
			case _SHARED_OWNERSHIP_QOS: return SHARED_OWNERSHIP_QOS;
			case _EXCLUSIVE_OWNERSHIP_QOS: return EXCLUSIVE_OWNERSHIP_QOS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SHARED_OWNERSHIP_QOS: return "SHARED_OWNERSHIP_QOS";
			case _EXCLUSIVE_OWNERSHIP_QOS: return "EXCLUSIVE_OWNERSHIP_QOS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected OwnershipQosPolicyKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
