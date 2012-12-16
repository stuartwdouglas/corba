package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyException".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyException
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyException(){}
	public org.omg.CosPropertyService.ExceptionReason reason;
	public java.lang.String failing_property_name;
	public PropertyException(org.omg.CosPropertyService.ExceptionReason reason, java.lang.String failing_property_name)
	{
		this.reason = reason;
		this.failing_property_name = failing_property_name;
	}
}
