package org.omg.Security;

/**
 * Generated from IDL struct "SecAttribute".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecAttribute
	implements org.omg.CORBA.portable.IDLEntity
{
	public SecAttribute(){}
	public org.omg.Security.AttributeType attribute_type;
	public byte[] defining_authority;
	public byte[] value;
	public SecAttribute(org.omg.Security.AttributeType attribute_type, byte[] defining_authority, byte[] value)
	{
		this.attribute_type = attribute_type;
		this.defining_authority = defining_authority;
		this.value = value;
	}
}
