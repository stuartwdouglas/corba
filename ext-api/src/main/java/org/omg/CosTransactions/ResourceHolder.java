package org.omg.CosTransactions;

/**
 * Generated from IDL interface "Resource".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class ResourceHolder	implements org.omg.CORBA.portable.Streamable{
	 public Resource value;
	public ResourceHolder()
	{
	}
	public ResourceHolder (final Resource initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ResourceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ResourceHelper.write (_out,value);
	}
}
