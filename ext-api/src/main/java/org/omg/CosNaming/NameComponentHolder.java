package org.omg.CosNaming;

/**
 * Generated from IDL struct "NameComponent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NameComponentHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NameComponent value;

	public NameComponentHolder ()
	{
	}
	public NameComponentHolder(final org.omg.CosNaming.NameComponent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NameComponentHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NameComponentHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NameComponentHelper.write(_out, value);
	}
}
