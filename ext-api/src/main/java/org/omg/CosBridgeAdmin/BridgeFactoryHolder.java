package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class BridgeFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public BridgeFactory value;
	public BridgeFactoryHolder()
	{
	}
	public BridgeFactoryHolder (final BridgeFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BridgeFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BridgeFactoryHelper.write (_out,value);
	}
}
