package org.omg.GIOP;

/**
 * Generated from IDL struct "LocateRequestHeader_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class LocateRequestHeader_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	public LocateRequestHeader_1_0(){}
	public int request_id;
	public byte[] object_key;
	public LocateRequestHeader_1_0(int request_id, byte[] object_key)
	{
		this.request_id = request_id;
		this.object_key = object_key;
	}
}
