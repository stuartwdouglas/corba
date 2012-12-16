package org.omg.CSIIOP;

/**
 * Generated from IDL struct "TLS_SEC_TRANS".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class TLS_SEC_TRANS
	implements org.omg.CORBA.portable.IDLEntity
{
	public TLS_SEC_TRANS(){}
	public short target_supports;
	public short target_requires;
	public org.omg.CSIIOP.TransportAddress[] addresses;
	public TLS_SEC_TRANS(short target_supports, short target_requires, org.omg.CSIIOP.TransportAddress[] addresses)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.addresses = addresses;
	}
}
