package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "InvalidValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class InvalidValue
	extends org.omg.CORBA.UserException
{
	public InvalidValue()
	{
		super(org.omg.CosNotifyFilter.InvalidValueHelper.id());
	}

	public org.omg.CosNotifyFilter.ConstraintExp constr;
	public org.omg.CORBA.Any value;
	public InvalidValue(java.lang.String _reason,org.omg.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		super(_reason);
		this.constr = constr;
		this.value = value;
	}
	public InvalidValue(org.omg.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		super(org.omg.CosNotifyFilter.InvalidValueHelper.id());
		this.constr = constr;
		this.value = value;
	}
}
