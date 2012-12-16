package org.omg.GIOP;

/**
 * Generated from IDL struct "IORAddressingInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class IORAddressingInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public IORAddressingInfo(){}
	public int selected_profile_index;
	public org.omg.IOP.IOR ior;
	public IORAddressingInfo(int selected_profile_index, org.omg.IOP.IOR ior)
	{
		this.selected_profile_index = selected_profile_index;
		this.ior = ior;
	}
}
