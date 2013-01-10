package org.omg.CosCollection;

/**
 * Generated from IDL interface "RACollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class RACollectionFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public RACollectionFactory value;
	public RACollectionFactoryHolder()
	{
	}
	public RACollectionFactoryHolder (final RACollectionFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RACollectionFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RACollectionFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RACollectionFactoryHelper.write (_out,value);
	}
}
