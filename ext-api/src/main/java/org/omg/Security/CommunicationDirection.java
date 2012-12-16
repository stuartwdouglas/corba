package org.omg.Security;
/**
 * Generated from IDL enum "CommunicationDirection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CommunicationDirection
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecDirectionBoth = 0;
	public static final CommunicationDirection SecDirectionBoth = new CommunicationDirection(_SecDirectionBoth);
	public static final int _SecDirectionRequest = 1;
	public static final CommunicationDirection SecDirectionRequest = new CommunicationDirection(_SecDirectionRequest);
	public static final int _SecDirectionReply = 2;
	public static final CommunicationDirection SecDirectionReply = new CommunicationDirection(_SecDirectionReply);
	public int value()
	{
		return value;
	}
	public static CommunicationDirection from_int(int value)
	{
		switch (value) {
			case _SecDirectionBoth: return SecDirectionBoth;
			case _SecDirectionRequest: return SecDirectionRequest;
			case _SecDirectionReply: return SecDirectionReply;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecDirectionBoth: return "SecDirectionBoth";
			case _SecDirectionRequest: return "SecDirectionRequest";
			case _SecDirectionReply: return "SecDirectionReply";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected CommunicationDirection(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
