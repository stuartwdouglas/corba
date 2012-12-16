package org.omg.IIOP;

/**
 * Generated from IDL struct "ListenPoint".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ListenPoint
	implements org.omg.CORBA.portable.IDLEntity
{
	public ListenPoint(){}
	public java.lang.String host = "";
	public short port;
	public ListenPoint(java.lang.String host, short port)
	{
		this.host = host;
		this.port = port;
	}
}
