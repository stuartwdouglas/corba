package org.omg.CosNotification;

/**
 * Generated from IDL struct "NamedPropertyRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class NamedPropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamedPropertyRange(){}
	public java.lang.String name;
	public org.omg.CosNotification.PropertyRange range;
	public NamedPropertyRange(java.lang.String name, org.omg.CosNotification.PropertyRange range)
	{
		this.name = name;
		this.range = range;
	}
}
