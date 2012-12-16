package org.omg.CosNaming;

/**
 * Generated from IDL alias "BindingList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class BindingListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.Binding[] value;

	public BindingListHolder ()
	{
	}
	public BindingListHolder (final org.omg.CosNaming.Binding[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BindingListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BindingListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BindingListHelper.write (out,value);
	}
}
