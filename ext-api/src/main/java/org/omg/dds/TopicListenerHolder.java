package org.omg.dds;

/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class TopicListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TopicListener value;
	public TopicListenerHolder()
	{
	}
	public TopicListenerHolder (final TopicListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TopicListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopicListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TopicListenerHelper.write (_out,value);
	}
}
