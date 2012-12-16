package org.omg.Messaging;


/**
 * Generated from IDL interface "ReplyEndTimePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ReplyEndTimePolicyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.ReplyEndTimePolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.Messaging.ReplyEndTimePolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/Messaging/ReplyEndTimePolicy:1.0", "ReplyEndTimePolicy");
	}
	public static String id()
	{
		return "IDL:omg.org/Messaging/ReplyEndTimePolicy:1.0";
	}
	public static ReplyEndTimePolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.Messaging.ReplyEndTimePolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.Messaging.ReplyEndTimePolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.ReplyEndTimePolicy)
		{
			return (org.omg.Messaging.ReplyEndTimePolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.Messaging.ReplyEndTimePolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.ReplyEndTimePolicy)
		{
			return (org.omg.Messaging.ReplyEndTimePolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
