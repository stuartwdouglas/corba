package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "InvalidConstraint".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class InvalidConstraint
	extends org.omg.CORBA.UserException
{
	public InvalidConstraint()
	{
		super(org.omg.CosNotifyFilter.InvalidConstraintHelper.id());
	}

	public org.omg.CosNotifyFilter.ConstraintExp constr;
	public InvalidConstraint(java.lang.String _reason,org.omg.CosNotifyFilter.ConstraintExp constr)
	{
		super(_reason);
		this.constr = constr;
	}
	public InvalidConstraint(org.omg.CosNotifyFilter.ConstraintExp constr)
	{
		super(org.omg.CosNotifyFilter.InvalidConstraintHelper.id());
		this.constr = constr;
	}
}
