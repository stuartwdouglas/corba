package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyMode
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyMode(){}
	public java.lang.String property_name;
	public org.omg.CosPropertyService.PropertyModeType property_mode;
	public PropertyMode(java.lang.String property_name, org.omg.CosPropertyService.PropertyModeType property_mode)
	{
		this.property_name = property_name;
		this.property_mode = property_mode;
	}
}
