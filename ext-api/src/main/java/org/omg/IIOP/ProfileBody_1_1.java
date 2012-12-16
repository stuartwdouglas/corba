package org.omg.IIOP;

/**
 * Generated from IDL struct "ProfileBody_1_1".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ProfileBody_1_1
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProfileBody_1_1(){}
	public org.omg.IIOP.Version iiop_version;
	public java.lang.String host = "";
	public short port;
	public byte[] object_key;
	public org.omg.IOP.TaggedComponent[] components;
	public ProfileBody_1_1(org.omg.IIOP.Version iiop_version, java.lang.String host, short port, byte[] object_key, org.omg.IOP.TaggedComponent[] components)
	{
		this.iiop_version = iiop_version;
		this.host = host;
		this.port = port;
		this.object_key = object_key;
		this.components = components;
	}
}
