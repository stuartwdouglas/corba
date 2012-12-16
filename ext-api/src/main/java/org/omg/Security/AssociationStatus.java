package org.omg.Security;
/**
 * Generated from IDL enum "AssociationStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AssociationStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecAssocSuccess = 0;
	public static final AssociationStatus SecAssocSuccess = new AssociationStatus(_SecAssocSuccess);
	public static final int _SecAssocFailure = 1;
	public static final AssociationStatus SecAssocFailure = new AssociationStatus(_SecAssocFailure);
	public static final int _SecAssocContinue = 2;
	public static final AssociationStatus SecAssocContinue = new AssociationStatus(_SecAssocContinue);
	public int value()
	{
		return value;
	}
	public static AssociationStatus from_int(int value)
	{
		switch (value) {
			case _SecAssocSuccess: return SecAssocSuccess;
			case _SecAssocFailure: return SecAssocFailure;
			case _SecAssocContinue: return SecAssocContinue;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecAssocSuccess: return "SecAssocSuccess";
			case _SecAssocFailure: return "SecAssocFailure";
			case _SecAssocContinue: return "SecAssocContinue";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AssociationStatus(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
