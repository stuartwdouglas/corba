package org.omg.dds;

/**
 * Generated from IDL interface "TopicDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class TopicDescriptionHolder	implements org.omg.CORBA.portable.Streamable{
	 public TopicDescription value;
	public TopicDescriptionHolder()
	{
	}
	public TopicDescriptionHolder (final TopicDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TopicDescriptionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopicDescriptionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TopicDescriptionHelper.write (_out,value);
	}
}
