package org.omg.CosCollection;

/**
 * Generated from IDL interface "CollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class CollectionFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionFactory value;
	public CollectionFactoryHolder()
	{
	}
	public CollectionFactoryHolder (final CollectionFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionFactoryHelper.write (_out,value);
	}
}
