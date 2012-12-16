package org.omg.CosCollection;

/**
 * Generated from IDL interface "RestrictedAccessCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class RestrictedAccessCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public RestrictedAccessCollection value;
	public RestrictedAccessCollectionHolder()
	{
	}
	public RestrictedAccessCollectionHolder (final RestrictedAccessCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RestrictedAccessCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RestrictedAccessCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RestrictedAccessCollectionHelper.write (_out,value);
	}
}
