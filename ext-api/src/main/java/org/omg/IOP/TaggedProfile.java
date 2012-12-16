package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedProfile
	implements org.omg.CORBA.portable.IDLEntity
{
	public TaggedProfile(){}
	public int tag;
	public byte[] profile_data;
	public TaggedProfile(int tag, byte[] profile_data)
	{
		this.tag = tag;
		this.profile_data = profile_data;
	}
}
