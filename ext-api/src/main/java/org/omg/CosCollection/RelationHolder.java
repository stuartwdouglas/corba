package org.omg.CosCollection;

/**
 * Generated from IDL interface "Relation".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class RelationHolder	implements org.omg.CORBA.portable.Streamable{
	 public Relation value;
	public RelationHolder()
	{
	}
	public RelationHolder (final Relation initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RelationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RelationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RelationHelper.write (_out,value);
	}
}
