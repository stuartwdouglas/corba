package org.omg.CORBA;

/**
 * Generated from IDL interface "ConstructionPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ConstructionPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ConstructionPolicy value;
	public ConstructionPolicyHolder()
	{
	}
	public ConstructionPolicyHolder (final ConstructionPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConstructionPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstructionPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConstructionPolicyHelper.write (_out,value);
	}
}
