package org.omg.CSIIOP;

/**
 * Generated from IDL struct "TransportAddress".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class TransportAddress
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransportAddress(){}
	public java.lang.String host_name = "";
	public short port;
	public TransportAddress(java.lang.String host_name, short port)
	{
		this.host_name = host_name;
		this.port = port;
	}
}
