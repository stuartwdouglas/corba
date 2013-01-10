package org.omg.Security;
/**
 * Generated from IDL enum "RequiresSupports".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class RequiresSupports
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecRequires = 0;
	public static final RequiresSupports SecRequires = new RequiresSupports(_SecRequires);
	public static final int _SecSupports = 1;
	public static final RequiresSupports SecSupports = new RequiresSupports(_SecSupports);
	public int value()
	{
		return value;
	}
	public static RequiresSupports from_int(int value)
	{
		switch (value) {
			case _SecRequires: return SecRequires;
			case _SecSupports: return SecSupports;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecRequires: return "SecRequires";
			case _SecSupports: return "SecSupports";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected RequiresSupports(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
