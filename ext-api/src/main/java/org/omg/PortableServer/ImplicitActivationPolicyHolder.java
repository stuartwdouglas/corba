package org.omg.PortableServer;

/**
 * Generated from IDL interface "ImplicitActivationPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:11 AM
 */

public final class ImplicitActivationPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ImplicitActivationPolicy value;
	public ImplicitActivationPolicyHolder()
	{
	}
	public ImplicitActivationPolicyHolder (final ImplicitActivationPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ImplicitActivationPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ImplicitActivationPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ImplicitActivationPolicyHelper.write (_out,value);
	}
}
