package org.omg.dds;

/**
 * Generated from IDL interface "GuardCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class GuardConditionHolder	implements org.omg.CORBA.portable.Streamable{
	 public GuardCondition value;
	public GuardConditionHolder()
	{
	}
	public GuardConditionHolder (final GuardCondition initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GuardConditionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GuardConditionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GuardConditionHelper.write (_out,value);
	}
}
