package org.omg.CORBA;

/**
 * Generated from IDL interface "DomainManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class DomainManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public DomainManager value;
	public DomainManagerHolder()
	{
	}
	public DomainManagerHolder (final DomainManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DomainManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DomainManagerHelper.write (_out,value);
	}
}
