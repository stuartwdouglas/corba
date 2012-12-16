package org.omg.GIOP;

/**
 * Generated from IDL struct "CancelRequestHeader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CancelRequestHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public CancelRequestHeader(){}
	public int request_id;
	public CancelRequestHeader(int request_id)
	{
		this.request_id = request_id;
	}
}
