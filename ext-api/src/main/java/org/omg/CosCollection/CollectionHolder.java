package org.omg.CosCollection;

/**
 * Generated from IDL interface "Collection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class CollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Collection value;
	public CollectionHolder()
	{
	}
	public CollectionHolder (final Collection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionHelper.write (_out,value);
	}
}
