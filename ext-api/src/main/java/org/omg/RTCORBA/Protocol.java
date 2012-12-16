package org.omg.RTCORBA;

/**
 * Generated from IDL struct "Protocol".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class Protocol
	implements org.omg.CORBA.portable.IDLEntity
{
	public Protocol(){}
	public int protocol_type;
	public org.omg.RTCORBA.ProtocolProperties orb_protocol_properties;
	public org.omg.RTCORBA.ProtocolProperties transport_protocol_properties;
	public Protocol(int protocol_type, org.omg.RTCORBA.ProtocolProperties orb_protocol_properties, org.omg.RTCORBA.ProtocolProperties transport_protocol_properties)
	{
		this.protocol_type = protocol_type;
		this.orb_protocol_properties = orb_protocol_properties;
		this.transport_protocol_properties = transport_protocol_properties;
	}
}
