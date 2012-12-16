package org.omg.PortableInterceptor.ORBInitInfoPackage;

/**
 * Generated from IDL exception "DuplicateName".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class DuplicateName
	extends org.omg.CORBA.UserException
{
	public DuplicateName()
	{
		super(org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicateName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicateName(java.lang.String name)
	{
		super(org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id());
		this.name = name;
	}
}
