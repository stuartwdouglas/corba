package org.omg.IIOP;

/**
 * Generated from IDL struct "BiDirIIOPServiceContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class BiDirIIOPServiceContext
	implements org.omg.CORBA.portable.IDLEntity
{
	public BiDirIIOPServiceContext(){}
	public org.omg.IIOP.ListenPoint[] listen_points;
	public BiDirIIOPServiceContext(org.omg.IIOP.ListenPoint[] listen_points)
	{
		this.listen_points = listen_points;
	}
}
