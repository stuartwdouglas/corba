package org.omg.Security;

/**
 * Generated from IDL struct "OpaqueBuffer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class OpaqueBuffer
	implements org.omg.CORBA.portable.IDLEntity
{
	public OpaqueBuffer(){}
	public byte[] buffer;
	public int startpos;
	public int endpos;
	public OpaqueBuffer(byte[] buffer, int startpos, int endpos)
	{
		this.buffer = buffer;
		this.startpos = startpos;
		this.endpos = endpos;
	}
}
