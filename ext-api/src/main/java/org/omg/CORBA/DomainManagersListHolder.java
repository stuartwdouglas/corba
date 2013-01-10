package org.omg.CORBA;

/**
 * Generated from IDL alias "DomainManagersList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class DomainManagersListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.DomainManager[] value;

	public DomainManagersListHolder ()
	{
	}
	public DomainManagersListHolder (final org.omg.CORBA.DomainManager[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DomainManagersListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainManagersListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DomainManagersListHelper.write (out,value);
	}
}
