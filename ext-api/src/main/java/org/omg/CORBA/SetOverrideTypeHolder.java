package org.omg.CORBA;
/**
 * Generated from IDL enum "SetOverrideType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class SetOverrideTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SetOverrideType value;

	public SetOverrideTypeHolder ()
	{
	}
	public SetOverrideTypeHolder (final SetOverrideType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SetOverrideTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SetOverrideTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SetOverrideTypeHelper.write (out,value);
	}
}
