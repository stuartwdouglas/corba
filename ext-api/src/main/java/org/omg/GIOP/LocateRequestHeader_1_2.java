package org.omg.GIOP;

/**
 * Generated from IDL struct "LocateRequestHeader_1_2".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class LocateRequestHeader_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	public LocateRequestHeader_1_2(){}
	public int request_id;
	public org.omg.GIOP.TargetAddress target;
	public LocateRequestHeader_1_2(int request_id, org.omg.GIOP.TargetAddress target)
	{
		this.request_id = request_id;
		this.target = target;
	}
}
