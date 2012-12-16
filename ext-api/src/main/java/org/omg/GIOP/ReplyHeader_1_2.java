package org.omg.GIOP;

/**
 * Generated from IDL struct "ReplyHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyHeader_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	public ReplyHeader_1_2(){}
	public int request_id;
	public org.omg.GIOP.ReplyStatusType_1_2 reply_status;
	public org.omg.IOP.ServiceContext[] service_context;
	public ReplyHeader_1_2(int request_id, org.omg.GIOP.ReplyStatusType_1_2 reply_status, org.omg.IOP.ServiceContext[] service_context)
	{
		this.request_id = request_id;
		this.reply_status = reply_status;
		this.service_context = service_context;
	}
}
