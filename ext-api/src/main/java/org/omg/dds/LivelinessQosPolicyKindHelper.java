package org.omg.dds;
/**
 * Generated from IDL enum "LivelinessQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessQosPolicyKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.LivelinessQosPolicyKindHelper.id(),"LivelinessQosPolicyKind",new String[]{"AUTOMATIC_LIVELINESS_QOS","MANUAL_BY_PARTICIPANT_LIVELINESS_QOS","MANUAL_BY_TOPIC_LIVELINESS_QOS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.LivelinessQosPolicyKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.LivelinessQosPolicyKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/LivelinessQosPolicyKind:1.0";
	}
	public static LivelinessQosPolicyKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return LivelinessQosPolicyKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final LivelinessQosPolicyKind s)
	{
		out.write_long(s.value());
	}
}
