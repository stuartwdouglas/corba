package org.omg.Security;
/**
 * Generated from IDL enum "SecurityContextType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SecurityContextType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecClientSecurityContext = 0;
	public static final SecurityContextType SecClientSecurityContext = new SecurityContextType(_SecClientSecurityContext);
	public static final int _SecServerSecurityContext = 1;
	public static final SecurityContextType SecServerSecurityContext = new SecurityContextType(_SecServerSecurityContext);
	public int value()
	{
		return value;
	}
	public static SecurityContextType from_int(int value)
	{
		switch (value) {
			case _SecClientSecurityContext: return SecClientSecurityContext;
			case _SecServerSecurityContext: return SecServerSecurityContext;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecClientSecurityContext: return "SecClientSecurityContext";
			case _SecServerSecurityContext: return "SecServerSecurityContext";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SecurityContextType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
