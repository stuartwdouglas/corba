package org.omg.Messaging;

/**
 * Generated from IDL interface "MaxHopsPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class MaxHopsPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public MaxHopsPolicy value;
	public MaxHopsPolicyHolder()
	{
	}
	public MaxHopsPolicyHolder (final MaxHopsPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MaxHopsPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MaxHopsPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MaxHopsPolicyHelper.write (_out,value);
	}
}
