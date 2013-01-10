package org.omg.CosNotification;

/**
 * Generated from IDL struct "PropertyRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class PropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyRange(){}
	public org.omg.CORBA.Any low_val;
	public org.omg.CORBA.Any high_val;
	public PropertyRange(org.omg.CORBA.Any low_val, org.omg.CORBA.Any high_val)
	{
		this.low_val = low_val;
		this.high_val = high_val;
	}
}
