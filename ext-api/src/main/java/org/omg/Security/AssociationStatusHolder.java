package org.omg.Security;
/**
 * Generated from IDL enum "AssociationStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AssociationStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AssociationStatus value;

	public AssociationStatusHolder ()
	{
	}
	public AssociationStatusHolder (final AssociationStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AssociationStatusHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AssociationStatusHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AssociationStatusHelper.write (out,value);
	}
}
