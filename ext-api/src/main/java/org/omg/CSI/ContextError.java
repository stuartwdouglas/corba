package org.omg.CSI;

/**
 * Generated from IDL struct "ContextError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ContextError
	implements org.omg.CORBA.portable.IDLEntity
{
	public ContextError(){}
	public long client_context_id;
	public int major_status;
	public int minor_status;
	public byte[] error_token;
	public ContextError(long client_context_id, int major_status, int minor_status, byte[] error_token)
	{
		this.client_context_id = client_context_id;
		this.major_status = major_status;
		this.minor_status = minor_status;
		this.error_token = error_token;
	}
}
