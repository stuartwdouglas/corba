package org.omg.GIOP;

/**
 * Generated from IDL struct "LocateReplyHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class LocateReplyHeader_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	public LocateReplyHeader_1_0(){}
	public int request_id;
	public org.omg.GIOP.LocateStatusType_1_0 locate_status;
	public LocateReplyHeader_1_0(int request_id, org.omg.GIOP.LocateStatusType_1_0 locate_status)
	{
		this.request_id = request_id;
		this.locate_status = locate_status;
	}
}
