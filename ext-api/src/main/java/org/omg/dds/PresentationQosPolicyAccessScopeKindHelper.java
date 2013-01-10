package org.omg.dds;
/**
 * Generated from IDL enum "PresentationQosPolicyAccessScopeKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PresentationQosPolicyAccessScopeKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.PresentationQosPolicyAccessScopeKindHelper.id(),"PresentationQosPolicyAccessScopeKind",new String[]{"INSTANCE_PRESENTATION_QOS","TOPIC_PRESENTATION_QOS","GROUP_PRESENTATION_QOS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.PresentationQosPolicyAccessScopeKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.PresentationQosPolicyAccessScopeKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/PresentationQosPolicyAccessScopeKind:1.0";
	}
	public static PresentationQosPolicyAccessScopeKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return PresentationQosPolicyAccessScopeKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PresentationQosPolicyAccessScopeKind s)
	{
		out.write_long(s.value());
	}
}
