package org.omg.dds;

/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class ListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public Listener value;
	public ListenerHolder()
	{
	}
	public ListenerHolder (final Listener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ListenerHelper.write (_out,value);
	}
}