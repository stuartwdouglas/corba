package org.omg.CosNotifyFilter;

/**
 * Generated from IDL struct "MappingConstraintPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class MappingConstraintPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public MappingConstraintPair(){}
	public org.omg.CosNotifyFilter.ConstraintExp constraint_expression;
	public org.omg.CORBA.Any result_to_set;
	public MappingConstraintPair(org.omg.CosNotifyFilter.ConstraintExp constraint_expression, org.omg.CORBA.Any result_to_set)
	{
		this.constraint_expression = constraint_expression;
		this.result_to_set = result_to_set;
	}
}
