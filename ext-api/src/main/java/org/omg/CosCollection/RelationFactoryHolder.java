package org.omg.CosCollection;

/**
 * Generated from IDL interface "RelationFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class RelationFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public RelationFactory value;
	public RelationFactoryHolder()
	{
	}
	public RelationFactoryHolder (final RelationFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RelationFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RelationFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RelationFactoryHelper.write (_out,value);
	}
}
