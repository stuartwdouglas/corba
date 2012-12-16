package org.omg.ETF;

/**
 * Generated from IDL interface "Profile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ProfileHolder	implements org.omg.CORBA.portable.Streamable{
	 public Profile value;
	public ProfileHolder()
	{
	}
	public ProfileHolder (final Profile initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProfileHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProfileHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProfileHelper.write (_out,value);
	}
}
