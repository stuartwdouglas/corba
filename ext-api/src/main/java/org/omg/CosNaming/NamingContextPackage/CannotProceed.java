package org.omg.CosNaming.NamingContextPackage;

/**
 * Generated from IDL exception "CannotProceed".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class CannotProceed
	extends org.omg.CORBA.UserException
{
	public CannotProceed()
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
	}

	public org.omg.CosNaming.NamingContext cxt;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public CannotProceed(java.lang.String _reason,org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(_reason);
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
	public CannotProceed(org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
}
