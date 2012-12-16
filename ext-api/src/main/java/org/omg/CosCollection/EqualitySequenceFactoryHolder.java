package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySequenceFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class EqualitySequenceFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySequenceFactory value;
	public EqualitySequenceFactoryHolder()
	{
	}
	public EqualitySequenceFactoryHolder (final EqualitySequenceFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySequenceFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySequenceFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySequenceFactoryHelper.write (_out,value);
	}
}
