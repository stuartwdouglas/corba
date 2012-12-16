package org.omg.PortableServer;

/**
 * Generated from IDL interface "POAManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class POAManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public POAManager value;
	public POAManagerHolder()
	{
	}
	public POAManagerHolder (final POAManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return POAManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		POAManagerHelper.write (_out,value);
	}
}
