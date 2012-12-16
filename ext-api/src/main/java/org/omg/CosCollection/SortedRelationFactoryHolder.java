package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedRelationFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class SortedRelationFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedRelationFactory value;
	public SortedRelationFactoryHolder()
	{
	}
	public SortedRelationFactoryHolder (final SortedRelationFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedRelationFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedRelationFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedRelationFactoryHelper.write (_out,value);
	}
}
