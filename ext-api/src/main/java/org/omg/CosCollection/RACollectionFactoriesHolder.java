package org.omg.CosCollection;

/**
 * Generated from IDL interface "RACollectionFactories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class RACollectionFactoriesHolder	implements org.omg.CORBA.portable.Streamable{
	 public RACollectionFactories value;
	public RACollectionFactoriesHolder()
	{
	}
	public RACollectionFactoriesHolder (final RACollectionFactories initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RACollectionFactoriesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RACollectionFactoriesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RACollectionFactoriesHelper.write (_out,value);
	}
}
