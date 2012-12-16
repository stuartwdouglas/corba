package org.omg.Security;
/**
 * Generated from IDL enum "RightsCombinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class RightsCombinator
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecAllRights = 0;
	public static final RightsCombinator SecAllRights = new RightsCombinator(_SecAllRights);
	public static final int _SecAnyRight = 1;
	public static final RightsCombinator SecAnyRight = new RightsCombinator(_SecAnyRight);
	public int value()
	{
		return value;
	}
	public static RightsCombinator from_int(int value)
	{
		switch (value) {
			case _SecAllRights: return SecAllRights;
			case _SecAnyRight: return SecAnyRight;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecAllRights: return "SecAllRights";
			case _SecAnyRight: return "SecAnyRight";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected RightsCombinator(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
