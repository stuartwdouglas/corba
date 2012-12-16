package org.omg.IOP;

/**
 * Generated from IDL struct "IOR".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class IOR
	implements org.omg.CORBA.portable.IDLEntity
{
	public IOR(){}
	public java.lang.String type_id = "";
	public org.omg.IOP.TaggedProfile[] profiles;
	public IOR(java.lang.String type_id, org.omg.IOP.TaggedProfile[] profiles)
	{
		this.type_id = type_id;
		this.profiles = profiles;
	}
}
