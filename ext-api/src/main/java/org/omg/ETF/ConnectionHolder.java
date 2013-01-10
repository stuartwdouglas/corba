package org.omg.ETF;

/**
 * Generated from IDL interface "Connection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ConnectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Connection value;
	public ConnectionHolder()
	{
	}
	public ConnectionHolder (final Connection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConnectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConnectionHelper.write (_out,value);
	}
}
