package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "MessageType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class MessageTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public MessageType value;

	public MessageTypeHolder ()
	{
	}
	public MessageTypeHolder (final MessageType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MessageTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MessageTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MessageTypeHelper.write (out,value);
	}
}
