package org.omg.ATLAS;

/**
 * Generated from IDL struct "ATLASProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ATLASProfile
	implements org.omg.CORBA.portable.IDLEntity
{
	public ATLASProfile(){}
	public org.omg.ATLAS.ATLASLocator the_locator;
	public byte[] the_cache_id;
	public ATLASProfile(org.omg.ATLAS.ATLASLocator the_locator, byte[] the_cache_id)
	{
		this.the_locator = the_locator;
		this.the_cache_id = the_cache_id;
	}
}
