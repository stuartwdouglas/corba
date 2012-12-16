package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedComponent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedComponent
	implements org.omg.CORBA.portable.IDLEntity
{
	public TaggedComponent(){}
	public int tag;
	public byte[] component_data;
	public TaggedComponent(int tag, byte[] component_data)
	{
		this.tag = tag;
		this.component_data = component_data;
	}
}
