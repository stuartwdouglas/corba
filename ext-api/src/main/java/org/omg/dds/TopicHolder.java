package org.omg.dds;

/**
 * Generated from IDL interface "Topic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class TopicHolder	implements org.omg.CORBA.portable.Streamable{
	 public Topic value;
	public TopicHolder()
	{
	}
	public TopicHolder (final Topic initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TopicHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopicHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TopicHelper.write (_out,value);
	}
}
