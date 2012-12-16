package org.omg.CosNotifyFilter;

/**
 * Generated from IDL struct "ConstraintInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class ConstraintInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConstraintInfo(){}
	public org.omg.CosNotifyFilter.ConstraintExp constraint_expression;
	public int constraint_id;
	public ConstraintInfo(org.omg.CosNotifyFilter.ConstraintExp constraint_expression, int constraint_id)
	{
		this.constraint_expression = constraint_expression;
		this.constraint_id = constraint_id;
	}
}
