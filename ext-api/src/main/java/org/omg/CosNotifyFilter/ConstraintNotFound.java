package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "ConstraintNotFound".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ConstraintNotFound
	extends org.omg.CORBA.UserException
{
	public ConstraintNotFound()
	{
		super(org.omg.CosNotifyFilter.ConstraintNotFoundHelper.id());
	}

	public int id;
	public ConstraintNotFound(java.lang.String _reason,int id)
	{
		super(_reason);
		this.id = id;
	}
	public ConstraintNotFound(int id)
	{
		super(org.omg.CosNotifyFilter.ConstraintNotFoundHelper.id());
		this.id = id;
	}
}
