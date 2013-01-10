package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "ExternalEndpointRole".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ExternalEndpointRole
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SOURCE = 0;
	public static final ExternalEndpointRole SOURCE = new ExternalEndpointRole(_SOURCE);
	public static final int _SINK = 1;
	public static final ExternalEndpointRole SINK = new ExternalEndpointRole(_SINK);
	public int value()
	{
		return value;
	}
	public static ExternalEndpointRole from_int(int value)
	{
		switch (value) {
			case _SOURCE: return SOURCE;
			case _SINK: return SINK;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SOURCE: return "SOURCE";
			case _SINK: return "SINK";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ExternalEndpointRole(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
