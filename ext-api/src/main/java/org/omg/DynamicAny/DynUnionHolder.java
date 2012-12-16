package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynUnion".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class DynUnionHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynUnion value;
	public DynUnionHolder()
	{
	}
	public DynUnionHolder (final DynUnion initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynUnionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynUnionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynUnionHelper.write (_out,value);
	}
}
