package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "DuplicateConstraintID".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class DuplicateConstraintID
	extends org.omg.CORBA.UserException
{
	public DuplicateConstraintID()
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id());
	}

	public int id;
	public DuplicateConstraintID(java.lang.String _reason,int id)
	{
		super(_reason);
		this.id = id;
	}
	public DuplicateConstraintID(int id)
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id());
		this.id = id;
	}
}
