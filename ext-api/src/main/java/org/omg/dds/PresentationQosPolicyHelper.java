package org.omg.dds;


/**
 * Generated from IDL struct "PresentationQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PresentationQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.PresentationQosPolicyHelper.id(),"PresentationQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("access_scope", org.omg.dds.PresentationQosPolicyAccessScopeKindHelper.type(), null),new org.omg.CORBA.StructMember("coherent_access", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("ordered_access", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.PresentationQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.PresentationQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/PresentationQosPolicy:1.0";
	}
	public static org.omg.dds.PresentationQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.PresentationQosPolicy result = new org.omg.dds.PresentationQosPolicy();
		result.access_scope=org.omg.dds.PresentationQosPolicyAccessScopeKindHelper.read(in);
		result.coherent_access=in.read_boolean();
		result.ordered_access=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.PresentationQosPolicy s)
	{
		org.omg.dds.PresentationQosPolicyAccessScopeKindHelper.write(out,s.access_scope);
		out.write_boolean(s.coherent_access);
		out.write_boolean(s.ordered_access);
	}
}
