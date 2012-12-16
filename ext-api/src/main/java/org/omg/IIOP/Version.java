package org.omg.IIOP;

/**
 * Generated from IDL struct "Version".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class Version
	implements org.omg.CORBA.portable.IDLEntity
{
	public Version(){}
	public byte major;
	public byte minor;
	public Version(byte major, byte minor)
	{
		this.major = major;
		this.minor = minor;
	}
}
