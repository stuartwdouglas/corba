package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "ExternalEndpointErrorCode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointErrorCode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _INVALID_CHANNELID = 0;
	public static final ExternalEndpointErrorCode INVALID_CHANNELID = new ExternalEndpointErrorCode(_INVALID_CHANNELID);
	public static final int _INVALID_JMSDESTINATION = 1;
	public static final ExternalEndpointErrorCode INVALID_JMSDESTINATION = new ExternalEndpointErrorCode(_INVALID_JMSDESTINATION);
	public static final int _MISMATCH_ENDPOINTROLE_NOTIFSTYLE = 2;
	public static final ExternalEndpointErrorCode MISMATCH_ENDPOINTROLE_NOTIFSTYLE = new ExternalEndpointErrorCode(_MISMATCH_ENDPOINTROLE_NOTIFSTYLE);
	public int value()
	{
		return value;
	}
	public static ExternalEndpointErrorCode from_int(int value)
	{
		switch (value) {
			case _INVALID_CHANNELID: return INVALID_CHANNELID;
			case _INVALID_JMSDESTINATION: return INVALID_JMSDESTINATION;
			case _MISMATCH_ENDPOINTROLE_NOTIFSTYLE: return MISMATCH_ENDPOINTROLE_NOTIFSTYLE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _INVALID_CHANNELID: return "INVALID_CHANNELID";
			case _INVALID_JMSDESTINATION: return "INVALID_JMSDESTINATION";
			case _MISMATCH_ENDPOINTROLE_NOTIFSTYLE: return "MISMATCH_ENDPOINTROLE_NOTIFSTYLE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ExternalEndpointErrorCode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
