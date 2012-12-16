package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "InvalidPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class InvalidPolicy
	extends org.omg.CORBA.UserException
{
	public InvalidPolicy()
	{
		super(org.omg.PortableServer.POAPackage.InvalidPolicyHelper.id());
	}

	public short index;
	public InvalidPolicy(java.lang.String _reason,short index)
	{
		super(_reason);
		this.index = index;
	}
	public InvalidPolicy(short index)
	{
		super(org.omg.PortableServer.POAPackage.InvalidPolicyHelper.id());
		this.index = index;
	}
}
