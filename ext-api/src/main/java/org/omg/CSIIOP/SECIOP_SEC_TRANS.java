package org.omg.CSIIOP;

/**
 * Generated from IDL struct "SECIOP_SEC_TRANS".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SECIOP_SEC_TRANS
	implements org.omg.CORBA.portable.IDLEntity
{
	public SECIOP_SEC_TRANS(){}
	public short target_supports;
	public short target_requires;
	public byte[] mech_oid;
	public byte[] target_name;
	public org.omg.CSIIOP.TransportAddress[] addresses;
	public SECIOP_SEC_TRANS(short target_supports, short target_requires, byte[] mech_oid, byte[] target_name, org.omg.CSIIOP.TransportAddress[] addresses)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.mech_oid = mech_oid;
		this.target_name = target_name;
		this.addresses = addresses;
	}
}
