package org.omg.dds;
/**
 * Generated from IDL enum "DurabilityQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DurabilityQosPolicyKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.DurabilityQosPolicyKindHelper.id(),"DurabilityQosPolicyKind",new String[]{"VOLATILE_DURABILITY_QOS","TRANSIENT_LOCAL_DURABILITY_QOS","TRANSIENT_DURABILITY_QOS","PERSISTENT_DURABILITY_QOS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DurabilityQosPolicyKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.DurabilityQosPolicyKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/DurabilityQosPolicyKind:1.0";
	}
	public static DurabilityQosPolicyKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return DurabilityQosPolicyKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final DurabilityQosPolicyKind s)
	{
		out.write_long(s.value());
	}
}
