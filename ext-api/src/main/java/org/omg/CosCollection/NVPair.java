package org.omg.CosCollection;

/**
 * Generated from IDL struct "NVPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class NVPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public NVPair(){}
	public java.lang.String name;
	public org.omg.CORBA.Any value;
	public NVPair(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
