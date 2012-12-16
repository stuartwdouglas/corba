package org.omg.CosCollection;

/**
 * Generated from IDL interface "SetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SetFactory value;
	public SetFactoryHolder()
	{
	}
	public SetFactoryHolder (final SetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SetFactoryHelper.write (_out,value);
	}
}
