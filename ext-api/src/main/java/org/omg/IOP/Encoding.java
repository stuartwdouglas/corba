package org.omg.IOP;

/**
 * Generated from IDL struct "Encoding".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class Encoding
	implements org.omg.CORBA.portable.IDLEntity
{
	public Encoding(){}
	public short format;
	public byte major_version;
	public byte minor_version;
	public Encoding(short format, byte major_version, byte minor_version)
	{
		this.format = format;
		this.major_version = major_version;
		this.minor_version = minor_version;
	}
}
