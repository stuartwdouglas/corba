package org.omg.PortableServer;

/**
 * Generated from IDL interface "POA".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class POAHolder	implements org.omg.CORBA.portable.Streamable{
	 public POA value;
	public POAHolder()
	{
	}
	public POAHolder (final POA initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return POAHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		POAHelper.write (_out,value);
	}
}
