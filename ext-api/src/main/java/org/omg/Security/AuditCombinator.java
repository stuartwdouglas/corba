package org.omg.Security;
/**
 * Generated from IDL enum "AuditCombinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AuditCombinator
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecAllSelectors = 0;
	public static final AuditCombinator SecAllSelectors = new AuditCombinator(_SecAllSelectors);
	public static final int _SecAnySelector = 1;
	public static final AuditCombinator SecAnySelector = new AuditCombinator(_SecAnySelector);
	public int value()
	{
		return value;
	}
	public static AuditCombinator from_int(int value)
	{
		switch (value) {
			case _SecAllSelectors: return SecAllSelectors;
			case _SecAnySelector: return SecAnySelector;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecAllSelectors: return "SecAllSelectors";
			case _SecAnySelector: return "SecAnySelector";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AuditCombinator(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
