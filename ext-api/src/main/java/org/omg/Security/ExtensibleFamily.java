package org.omg.Security;

/**
 * Generated from IDL struct "ExtensibleFamily".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ExtensibleFamily
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExtensibleFamily(){}
	public short family_definer;
	public short family;
	public ExtensibleFamily(short family_definer, short family)
	{
		this.family_definer = family_definer;
		this.family = family;
	}
}
