package org.omg.CosPropertyService;

/**
 * Generated from IDL struct "PropertyException".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
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
