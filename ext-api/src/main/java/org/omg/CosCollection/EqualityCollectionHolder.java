package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class EqualityCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityCollection value;
	public EqualityCollectionHolder()
	{
	}
	public EqualityCollectionHolder (final EqualityCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityCollectionHelper.write (_out,value);
	}
}
