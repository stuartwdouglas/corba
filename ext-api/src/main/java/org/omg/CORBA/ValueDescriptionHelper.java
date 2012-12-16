package org.omg.CORBA;


/**
 * Generated from IDL struct "ValueDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ValueDescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ValueDescriptionHelper.id(),"ValueDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("is_abstract", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("is_custom", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.VersionSpecHelper.type(), null),new org.omg.CORBA.StructMember("supported_interfaces", org.omg.CORBA.RepositoryIdSeqHelper.type(), null),new org.omg.CORBA.StructMember("abstract_base_values", org.omg.CORBA.RepositoryIdSeqHelper.type(), null),new org.omg.CORBA.StructMember("is_truncatable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("base_value", org.omg.CORBA.RepositoryIdHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ValueDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ValueDescription extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ValueDescription:1.0";
	}
	public static org.omg.CORBA.ValueDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ValueDescription result = new org.omg.CORBA.ValueDescription();
		result.name=in.read_string();
		result.id=in.read_string();
		result.is_abstract=in.read_boolean();
		result.is_custom=in.read_boolean();
		result.defined_in=in.read_string();
		result.version=in.read_string();
		result.supported_interfaces = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.abstract_base_values = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.is_truncatable=in.read_boolean();
		result.base_value=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ValueDescription s)
	{
		out.write_string(s.name);
		out.write_string(s.id);
		out.write_boolean(s.is_abstract);
		out.write_boolean(s.is_custom);
		out.write_string(s.defined_in);
		out.write_string(s.version);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.supported_interfaces);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.abstract_base_values);
		out.write_boolean(s.is_truncatable);
		out.write_string(s.base_value);
	}
}
