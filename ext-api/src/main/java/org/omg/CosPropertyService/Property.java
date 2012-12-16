package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "Property".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class Property
	implements org.omg.CORBA.portable.IDLEntity
{
	public Property(){}
	public java.lang.String property_name;
	public org.omg.CORBA.Any property_value;
	public Property(java.lang.String property_name, org.omg.CORBA.Any property_value)
	{
		this.property_name = property_name;
		this.property_value = property_value;
	}
}
