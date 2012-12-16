package org.omg.GIOP;

/**
 * Generated from IDL struct "SystemExceptionReplyBody".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class SystemExceptionReplyBody
	implements org.omg.CORBA.portable.IDLEntity
{
	public SystemExceptionReplyBody(){}
	public java.lang.String exception_id = "";
	public int minor_code_value;
	public int completion_status;
	public SystemExceptionReplyBody(java.lang.String exception_id, int minor_code_value, int completion_status)
	{
		this.exception_id = exception_id;
		this.minor_code_value = minor_code_value;
		this.completion_status = completion_status;
	}
}
