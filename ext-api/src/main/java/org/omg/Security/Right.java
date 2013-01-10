package org.omg.Security;

/**
 * Generated from IDL struct "Right".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class Right
	implements org.omg.CORBA.portable.IDLEntity
{
	public Right(){}
	public org.omg.Security.ExtensibleFamily rights_family;
	public java.lang.String right = "";
	public Right(org.omg.Security.ExtensibleFamily rights_family, java.lang.String right)
	{
		this.rights_family = rights_family;
		this.right = right;
	}
}
