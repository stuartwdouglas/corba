package org.omg.GIOP;

/**
 * Generated from IDL struct "RequestHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class RequestHeader_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	public RequestHeader_1_0(){}
	public org.omg.IOP.ServiceContext[] service_context;
	public int request_id;
	public boolean response_expected;
	public byte[] object_key;
	public java.lang.String operation = "";
	public byte[] requesting_principal;
	public RequestHeader_1_0(org.omg.IOP.ServiceContext[] service_context, int request_id, boolean response_expected, byte[] object_key, java.lang.String operation, byte[] requesting_principal)
	{
		this.service_context = service_context;
		this.request_id = request_id;
		this.response_expected = response_expected;
		this.object_key = object_key;
		this.operation = operation;
		this.requesting_principal = requesting_principal;
	}
}
