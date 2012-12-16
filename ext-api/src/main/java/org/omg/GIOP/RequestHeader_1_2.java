package org.omg.GIOP;

/**
 * Generated from IDL struct "RequestHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RequestHeader_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	public RequestHeader_1_2(){}
	public int request_id;
	public byte response_flags;
	public byte[] reserved;
	public org.omg.GIOP.TargetAddress target;
	public java.lang.String operation = "";
	public org.omg.IOP.ServiceContext[] service_context;
	public RequestHeader_1_2(int request_id, byte response_flags, byte[] reserved, org.omg.GIOP.TargetAddress target, java.lang.String operation, org.omg.IOP.ServiceContext[] service_context)
	{
		this.request_id = request_id;
		this.response_flags = response_flags;
		this.reserved = reserved;
		this.target = target;
		this.operation = operation;
		this.service_context = service_context;
	}
}
