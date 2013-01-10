package org.omg.dds;

/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ReadConditionHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReadCondition value;
	public ReadConditionHolder()
	{
	}
	public ReadConditionHolder (final ReadCondition initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReadConditionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReadConditionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReadConditionHelper.write (_out,value);
	}
}
