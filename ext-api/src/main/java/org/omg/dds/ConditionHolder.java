package org.omg.dds;

/**
 * Generated from IDL interface "Condition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ConditionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Condition value;
	public ConditionHolder()
	{
	}
	public ConditionHolder (final Condition initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConditionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConditionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConditionHelper.write (_out,value);
	}
}
