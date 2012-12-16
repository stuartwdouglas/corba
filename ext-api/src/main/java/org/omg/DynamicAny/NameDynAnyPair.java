package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameDynAnyPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class NameDynAnyPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameDynAnyPair(){}
	public java.lang.String id;
	public org.omg.DynamicAny.DynAny value;
	public NameDynAnyPair(java.lang.String id, org.omg.DynamicAny.DynAny value)
	{
		this.id = id;
		this.value = value;
	}
}
