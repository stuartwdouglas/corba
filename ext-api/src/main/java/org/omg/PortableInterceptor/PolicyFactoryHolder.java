package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "PolicyFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class PolicyFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public PolicyFactory value;
	public PolicyFactoryHolder()
	{
	}
	public PolicyFactoryHolder (final PolicyFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PolicyFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PolicyFactoryHelper.write (_out,value);
	}
}
