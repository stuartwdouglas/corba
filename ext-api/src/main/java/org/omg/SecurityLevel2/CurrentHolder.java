package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CurrentHolder	implements org.omg.CORBA.portable.Streamable{
	 public Current value;
	public CurrentHolder()
	{
	}
	public CurrentHolder (final Current initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CurrentHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CurrentHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CurrentHelper.write (_out,value);
	}
}
