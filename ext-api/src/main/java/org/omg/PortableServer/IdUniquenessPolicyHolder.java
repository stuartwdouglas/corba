package org.omg.PortableServer;

/**
 * Generated from IDL interface "IdUniquenessPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class IdUniquenessPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public IdUniquenessPolicy value;
	public IdUniquenessPolicyHolder()
	{
	}
	public IdUniquenessPolicyHolder (final IdUniquenessPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IdUniquenessPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdUniquenessPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IdUniquenessPolicyHelper.write (_out,value);
	}
}
