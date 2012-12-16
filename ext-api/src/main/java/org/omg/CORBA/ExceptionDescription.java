package org.omg.CORBA;

/**
 * Generated from IDL struct "ExceptionDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ExceptionDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExceptionDescription(){}
	public java.lang.String name;
	public java.lang.String id;
	public java.lang.String defined_in;
	public java.lang.String version;
	public org.omg.CORBA.TypeCode type;
	public ExceptionDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version, org.omg.CORBA.TypeCode type)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
		this.type = type;
	}
}
