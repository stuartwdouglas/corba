package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "JMSDestinationType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class JMSDestinationTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public JMSDestinationType value;

	public JMSDestinationTypeHolder ()
	{
	}
	public JMSDestinationTypeHolder (final JMSDestinationType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return JMSDestinationTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = JMSDestinationTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		JMSDestinationTypeHelper.write (out,value);
	}
}
