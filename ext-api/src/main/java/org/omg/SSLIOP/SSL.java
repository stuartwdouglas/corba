package org.omg.SSLIOP;

/**
 * Generated from IDL struct "SSL".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SSL
	implements org.omg.CORBA.portable.IDLEntity
{
	public SSL(){}
	public short target_supports;
	public short target_requires;
	public short port;
	public SSL(short target_supports, short target_requires, short port)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.port = port;
	}
}
