package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameValuePair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameValuePair
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameValuePair(){}
	public java.lang.String id;
	public org.omg.CORBA.Any value;
	public NameValuePair(java.lang.String id, org.omg.CORBA.Any value)
	{
		this.id = id;
		this.value = value;
	}
}
