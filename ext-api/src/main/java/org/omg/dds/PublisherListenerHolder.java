package org.omg.dds;

/**
 * Generated from IDL interface "PublisherListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PublisherListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public PublisherListener value;
	public PublisherListenerHolder()
	{
	}
	public PublisherListenerHolder (final PublisherListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PublisherListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PublisherListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PublisherListenerHelper.write (_out,value);
	}
}
