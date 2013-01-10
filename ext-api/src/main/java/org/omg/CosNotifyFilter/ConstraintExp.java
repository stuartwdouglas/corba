package org.omg.CosNotifyFilter;

/**
 * Generated from IDL struct "ConstraintExp".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ConstraintExp
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConstraintExp(){}
	public org.omg.CosNotification.EventType[] event_types;
	public java.lang.String constraint_expr = "";
	public ConstraintExp(org.omg.CosNotification.EventType[] event_types, java.lang.String constraint_expr)
	{
		this.event_types = event_types;
		this.constraint_expr = constraint_expr;
	}
}
