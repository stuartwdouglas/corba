package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "MappingFilter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class MappingFilterHolder	implements org.omg.CORBA.portable.Streamable{
	 public MappingFilter value;
	public MappingFilterHolder()
	{
	}
	public MappingFilterHolder (final MappingFilter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MappingFilterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingFilterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MappingFilterHelper.write (_out,value);
	}
}
