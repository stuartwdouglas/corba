package org.omg.GIOP;

/**
 * Generated from IDL struct "MessageHeader_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class MessageHeader_1_1
	implements org.omg.CORBA.portable.IDLEntity
{
	public MessageHeader_1_1(){}
	public char[] magic;
	public org.omg.GIOP.Version GIOP_version;
	public byte flags;
	public byte message_type;
	public int message_size;
	public MessageHeader_1_1(char[] magic, org.omg.GIOP.Version GIOP_version, byte flags, byte message_type, int message_size)
	{
		this.magic = magic;
		this.GIOP_version = GIOP_version;
		this.flags = flags;
		this.message_type = message_type;
		this.message_size = message_size;
	}
}
