package org.omg.Messaging;


/**
 * Generated from IDL interface "ReplyHandler".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ReplyHandlerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.ReplyHandler s)
	{
			any.insert_Object(s);
	}
	public static org.omg.Messaging.ReplyHandler extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/Messaging/ReplyHandler:1.0", "ReplyHandler");
	}
	public static String id()
	{
		return "IDL:omg.org/Messaging/ReplyHandler:1.0";
	}
	public static ReplyHandler read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.Messaging.ReplyHandler s)
	{
		_out.write_Object(s);
	}
	public static org.omg.Messaging.ReplyHandler narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.ReplyHandler)
		{
			return (org.omg.Messaging.ReplyHandler)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.Messaging.ReplyHandler unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.ReplyHandler)
		{
			return (org.omg.Messaging.ReplyHandler)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
