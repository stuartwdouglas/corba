package org.omg.Security;

/**
 * Generated from IDL struct "MechandOptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class MechandOptionsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.MechandOptions value;

	public MechandOptionsHolder ()
	{
	}
	public MechandOptionsHolder(final org.omg.Security.MechandOptions initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.MechandOptionsHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.MechandOptionsHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.MechandOptionsHelper.write(_out, value);
	}
}
