package org.omg.Messaging;


/**
 * Generated from IDL interface "RelativeRoundtripTimeoutPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RelativeRoundtripTimeoutPolicyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.RelativeRoundtripTimeoutPolicy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/Messaging/RelativeRoundtripTimeoutPolicy:1.0", "RelativeRoundtripTimeoutPolicy");
	}
	public static String id()
	{
		return "IDL:omg.org/Messaging/RelativeRoundtripTimeoutPolicy:1.0";
	}
	public static RelativeRoundtripTimeoutPolicy read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.Messaging.RelativeRoundtripTimeoutPolicy s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.RelativeRoundtripTimeoutPolicy)
		{
			return (org.omg.Messaging.RelativeRoundtripTimeoutPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.Messaging.RelativeRoundtripTimeoutPolicy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.Messaging.RelativeRoundtripTimeoutPolicy)
		{
			return (org.omg.Messaging.RelativeRoundtripTimeoutPolicy)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
