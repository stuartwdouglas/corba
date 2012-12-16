package org.omg.ATLAS;

/**
 * Generated from IDL union "ATLASLocator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ATLASLocator
	implements org.omg.CORBA.portable.IDLEntity
{
	private int discriminator;
	private org.omg.ATLAS.CosNamingLocator naming_locator;
	private java.lang.String the_url;
	private org.omg.ATLAS.AuthTokenDispenser the_dispenser;

	public ATLASLocator ()
	{
	}

	public int discriminator ()
	{
		return discriminator;
	}

	public org.omg.ATLAS.CosNamingLocator naming_locator ()
	{
		if (discriminator != 1)
			throw new org.omg.CORBA.BAD_OPERATION();
		return naming_locator;
	}

	public void naming_locator (org.omg.ATLAS.CosNamingLocator _x)
	{
		discriminator = 1;
		naming_locator = _x;
	}

	public java.lang.String the_url ()
	{
		if (discriminator != 2)
			throw new org.omg.CORBA.BAD_OPERATION();
		return the_url;
	}

	public void the_url (java.lang.String _x)
	{
		discriminator = 2;
		the_url = _x;
	}

	public org.omg.ATLAS.AuthTokenDispenser the_dispenser ()
	{
		if (discriminator != 3)
			throw new org.omg.CORBA.BAD_OPERATION();
		return the_dispenser;
	}

	public void the_dispenser (org.omg.ATLAS.AuthTokenDispenser _x)
	{
		discriminator = 3;
		the_dispenser = _x;
	}

	public void __default ()
	{
		discriminator = 0;
	}
	public void __default (int _discriminator)
	{
		discriminator = _discriminator;
	}
}
