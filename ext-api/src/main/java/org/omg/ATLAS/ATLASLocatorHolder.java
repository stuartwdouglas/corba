package org.omg.ATLAS;
/**
 * Generated from IDL union "ATLASLocator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class ATLASLocatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ATLASLocator value;

	public ATLASLocatorHolder ()
	{
	}
	public ATLASLocatorHolder (final ATLASLocator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ATLASLocatorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ATLASLocatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ATLASLocatorHelper.write (out, value);
	}
}
