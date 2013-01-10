package org.omg.dds;
/**
 * Generated from IDL enum "SampleRejectedStatusKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleRejectedStatusKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.SampleRejectedStatusKindHelper.id(),"SampleRejectedStatusKind",new String[]{"REJECTED_BY_INSTANCE_LIMIT","REJECTED_BY_TOPIC_LIMIT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.SampleRejectedStatusKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.SampleRejectedStatusKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/SampleRejectedStatusKind:1.0";
	}
	public static SampleRejectedStatusKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return SampleRejectedStatusKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SampleRejectedStatusKind s)
	{
		out.write_long(s.value());
	}
}
