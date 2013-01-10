package org.omg.CORBA;

/**
 * Generated from IDL exception "InvalidPolicies".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class InvalidPolicies
	extends org.omg.CORBA.UserException
{
	public InvalidPolicies()
	{
		super(org.omg.CORBA.InvalidPoliciesHelper.id());
	}

	public short[] indices;
	public InvalidPolicies(java.lang.String _reason,short[] indices)
	{
		super(_reason);
		this.indices = indices;
	}
	public InvalidPolicies(short[] indices)
	{
		super(org.omg.CORBA.InvalidPoliciesHelper.id());
		this.indices = indices;
	}
}
