package org.omg.IOP;

/**
 * Generated from IDL struct "ServiceContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ServiceContext
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceContext(){}
	public int context_id;
	public byte[] context_data;
	public ServiceContext(int context_id, byte[] context_data)
	{
		this.context_id = context_id;
		this.context_data = context_data;
	}
}
