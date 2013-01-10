package org.omg.CosNotification;

/**
 * Generated from IDL struct "Property".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class Property
	implements org.omg.CORBA.portable.IDLEntity
{
	public Property(){}
	public java.lang.String name;
	public org.omg.CORBA.Any value;
	public Property(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
