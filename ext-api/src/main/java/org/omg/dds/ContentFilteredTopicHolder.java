package org.omg.dds;

/**
 * Generated from IDL interface "ContentFilteredTopic".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class ContentFilteredTopicHolder	implements org.omg.CORBA.portable.Streamable{
	 public ContentFilteredTopic value;
	public ContentFilteredTopicHolder()
	{
	}
	public ContentFilteredTopicHolder (final ContentFilteredTopic initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ContentFilteredTopicHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContentFilteredTopicHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ContentFilteredTopicHelper.write (_out,value);
	}
}
