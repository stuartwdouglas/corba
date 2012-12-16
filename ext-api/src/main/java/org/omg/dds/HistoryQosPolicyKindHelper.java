package org.omg.dds;
/**
 * Generated from IDL enum "HistoryQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class HistoryQosPolicyKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.HistoryQosPolicyKindHelper.id(),"HistoryQosPolicyKind",new String[]{"KEEP_LAST_HISTORY_QOS","KEEP_ALL_HISTORY_QOS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.HistoryQosPolicyKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.HistoryQosPolicyKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/HistoryQosPolicyKind:1.0";
	}
	public static HistoryQosPolicyKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return HistoryQosPolicyKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HistoryQosPolicyKind s)
	{
		out.write_long(s.value());
	}
}