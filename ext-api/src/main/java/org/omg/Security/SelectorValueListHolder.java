package org.omg.Security;

/**
 * Generated from IDL alias "SelectorValueList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SelectorValueListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.SelectorValue[] value;

	public SelectorValueListHolder ()
	{
	}
	public SelectorValueListHolder (final org.omg.Security.SelectorValue[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SelectorValueListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SelectorValueListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SelectorValueListHelper.write (out,value);
	}
}
