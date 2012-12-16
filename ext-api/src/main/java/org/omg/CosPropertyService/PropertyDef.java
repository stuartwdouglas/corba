package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyDef
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyDef(){}
	public java.lang.String property_name;
	public org.omg.CORBA.Any property_value;
	public org.omg.CosPropertyService.PropertyModeType property_mode;
	public PropertyDef(java.lang.String property_name, org.omg.CORBA.Any property_value, org.omg.CosPropertyService.PropertyModeType property_mode)
	{
		this.property_name = property_name;
		this.property_value = property_value;
		this.property_mode = property_mode;
	}
}
