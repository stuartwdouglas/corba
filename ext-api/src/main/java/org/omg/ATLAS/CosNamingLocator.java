package org.omg.ATLAS;

/**
 * Generated from IDL struct "CosNamingLocator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CosNamingLocator
	implements org.omg.CORBA.portable.IDLEntity
{
	public CosNamingLocator(){}
	public org.omg.CosNaming.NamingContext name_service;
	public org.omg.CosNaming.NameComponent[] the_name;
	public CosNamingLocator(org.omg.CosNaming.NamingContext name_service, org.omg.CosNaming.NameComponent[] the_name)
	{
		this.name_service = name_service;
		this.the_name = the_name;
	}
}
