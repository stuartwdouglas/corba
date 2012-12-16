package org.omg.GIOP;

/**
 * Generated from IDL struct "MessageHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class MessageHeader_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	public MessageHeader_1_0(){}
	public char[] magic;
	public org.omg.GIOP.Version GIOP_version;
	public boolean byte_order;
	public byte message_type;
	public int message_size;
	public MessageHeader_1_0(char[] magic, org.omg.GIOP.Version GIOP_version, boolean byte_order, byte message_type, int message_size)
	{
		this.magic = magic;
		this.GIOP_version = GIOP_version;
		this.byte_order = byte_order;
		this.message_type = message_type;
		this.message_size = message_size;
	}
}
