package org.omg.CORBA;

/**
 * Generated from IDL interface "PolicyCurrent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class PolicyCurrentHolder	implements org.omg.CORBA.portable.Streamable{
	 public PolicyCurrent value;
	public PolicyCurrentHolder()
	{
	}
	public PolicyCurrentHolder (final PolicyCurrent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PolicyCurrentHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyCurrentHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PolicyCurrentHelper.write (_out,value);
	}
}
