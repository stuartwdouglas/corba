package org.omg.CosNaming;

/**
 * Generated from IDL interface "NamingContextExt".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NamingContextExtHolder	implements org.omg.CORBA.portable.Streamable{
	 public NamingContextExt value;
	public NamingContextExtHolder()
	{
	}
	public NamingContextExtHolder (final NamingContextExt initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NamingContextExtHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingContextExtHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NamingContextExtHelper.write (_out,value);
	}
}
