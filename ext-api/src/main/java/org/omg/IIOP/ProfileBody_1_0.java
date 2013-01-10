package org.omg.IIOP;

/**
 * Generated from IDL struct "ProfileBody_1_0".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ProfileBody_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProfileBody_1_0(){}
	public org.omg.IIOP.Version iiop_version;
	public java.lang.String host = "";
	public short port;
	public byte[] object_key;
	public ProfileBody_1_0(org.omg.IIOP.Version iiop_version, java.lang.String host, short port, byte[] object_key)
	{
		this.iiop_version = iiop_version;
		this.host = host;
		this.port = port;
		this.object_key = object_key;
	}
}
