package org.omg.CORBA;

/**
 * Generated from IDL interface "AliasDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class AliasDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public AliasDef value;
	public AliasDefHolder()
	{
	}
	public AliasDefHolder (final AliasDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AliasDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AliasDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AliasDefHelper.write (_out,value);
	}
}
