package org.omg.Security;

/**
 * Generated from IDL alias "MechanismTypeList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class MechanismTypeListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public MechanismTypeListHolder ()
	{
	}
	public MechanismTypeListHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MechanismTypeListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MechanismTypeListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MechanismTypeListHelper.write (out,value);
	}
}
