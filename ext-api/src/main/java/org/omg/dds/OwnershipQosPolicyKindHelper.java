package org.omg.dds;
/**
 * Generated from IDL enum "OwnershipQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class OwnershipQosPolicyKindHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.dds.OwnershipQosPolicyKindHelper.id(),"OwnershipQosPolicyKind",new String[]{"SHARED_OWNERSHIP_QOS","EXCLUSIVE_OWNERSHIP_QOS"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.OwnershipQosPolicyKind s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.OwnershipQosPolicyKind extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/OwnershipQosPolicyKind:1.0";
	}
	public static OwnershipQosPolicyKind read (final org.omg.CORBA.portable.InputStream in)
	{
		return OwnershipQosPolicyKind.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final OwnershipQosPolicyKind s)
	{
		out.write_long(s.value());
	}
}
