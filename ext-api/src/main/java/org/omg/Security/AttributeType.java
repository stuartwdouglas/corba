package org.omg.Security;

/**
 * Generated from IDL struct "AttributeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AttributeType
	implements org.omg.CORBA.portable.IDLEntity
{
	public AttributeType(){}
	public org.omg.Security.ExtensibleFamily attribute_family;
	public int attribute_type;
	public AttributeType(org.omg.Security.ExtensibleFamily attribute_family, int attribute_type)
	{
		this.attribute_family = attribute_family;
		this.attribute_type = attribute_type;
	}
}
