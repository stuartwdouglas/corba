package org.omg.PortableServer;
/**
 * Generated from IDL enum "ImplicitActivationPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ImplicitActivationPolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _IMPLICIT_ACTIVATION = 0;
	public static final ImplicitActivationPolicyValue IMPLICIT_ACTIVATION = new ImplicitActivationPolicyValue(_IMPLICIT_ACTIVATION);
	public static final int _NO_IMPLICIT_ACTIVATION = 1;
	public static final ImplicitActivationPolicyValue NO_IMPLICIT_ACTIVATION = new ImplicitActivationPolicyValue(_NO_IMPLICIT_ACTIVATION);
	public int value()
	{
		return value;
	}
	public static ImplicitActivationPolicyValue from_int(int value)
	{
		switch (value) {
			case _IMPLICIT_ACTIVATION: return IMPLICIT_ACTIVATION;
			case _NO_IMPLICIT_ACTIVATION: return NO_IMPLICIT_ACTIVATION;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _IMPLICIT_ACTIVATION: return "IMPLICIT_ACTIVATION";
			case _NO_IMPLICIT_ACTIVATION: return "NO_IMPLICIT_ACTIVATION";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ImplicitActivationPolicyValue(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
