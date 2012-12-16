package org.omg.GIOP;
/**
 * Generated from IDL enum "MsgType_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class MsgType_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _Request = 0;
	public static final MsgType_1_0 Request = new MsgType_1_0(_Request);
	public static final int _Reply = 1;
	public static final MsgType_1_0 Reply = new MsgType_1_0(_Reply);
	public static final int _CancelRequest = 2;
	public static final MsgType_1_0 CancelRequest = new MsgType_1_0(_CancelRequest);
	public static final int _LocateRequest = 3;
	public static final MsgType_1_0 LocateRequest = new MsgType_1_0(_LocateRequest);
	public static final int _LocateReply = 4;
	public static final MsgType_1_0 LocateReply = new MsgType_1_0(_LocateReply);
	public static final int _CloseConnection = 5;
	public static final MsgType_1_0 CloseConnection = new MsgType_1_0(_CloseConnection);
	public static final int _MessageError = 6;
	public static final MsgType_1_0 MessageError = new MsgType_1_0(_MessageError);
	public int value()
	{
		return value;
	}
	public static MsgType_1_0 from_int(int value)
	{
		switch (value) {
			case _Request: return Request;
			case _Reply: return Reply;
			case _CancelRequest: return CancelRequest;
			case _LocateRequest: return LocateRequest;
			case _LocateReply: return LocateReply;
			case _CloseConnection: return CloseConnection;
			case _MessageError: return MessageError;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _Request: return "Request";
			case _Reply: return "Reply";
			case _CancelRequest: return "CancelRequest";
			case _LocateRequest: return "LocateRequest";
			case _LocateReply: return "LocateReply";
			case _CloseConnection: return "CloseConnection";
			case _MessageError: return "MessageError";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MsgType_1_0(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
