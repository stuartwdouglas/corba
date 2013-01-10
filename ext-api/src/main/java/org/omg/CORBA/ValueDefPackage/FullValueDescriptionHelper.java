package org.omg.CORBA.ValueDefPackage;


/**
 * Generated from IDL struct "FullValueDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class FullValueDescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.id(),"FullValueDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("is_abstract", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("is_custom", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.VersionSpecHelper.type(), null),new org.omg.CORBA.StructMember("operations", org.omg.CORBA.OpDescriptionSeqHelper.type(), null),new org.omg.CORBA.StructMember("attributes", org.omg.CORBA.AttrDescriptionSeqHelper.type(), null),new org.omg.CORBA.StructMember("members", org.omg.CORBA.ValueMemberSeqHelper.type(), null),new org.omg.CORBA.StructMember("initializers", org.omg.CORBA.InitializerSeqHelper.type(), null),new org.omg.CORBA.StructMember("supported_interfaces", org.omg.CORBA.RepositoryIdSeqHelper.type(), null),new org.omg.CORBA.StructMember("abstract_base_values", org.omg.CORBA.RepositoryIdSeqHelper.type(), null),new org.omg.CORBA.StructMember("is_truncatable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("base_value", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ValueDefPackage.FullValueDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ValueDefPackage.FullValueDescription extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ValueDef/FullValueDescription:1.0";
	}
	public static org.omg.CORBA.ValueDefPackage.FullValueDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ValueDefPackage.FullValueDescription result = new org.omg.CORBA.ValueDefPackage.FullValueDescription();
		result.name=in.read_string();
		result.id=in.read_string();
		result.is_abstract=in.read_boolean();
		result.is_custom=in.read_boolean();
		result.defined_in=in.read_string();
		result.version=in.read_string();
		result.operations = org.omg.CORBA.OpDescriptionSeqHelper.read(in);
		result.attributes = org.omg.CORBA.AttrDescriptionSeqHelper.read(in);
		result.members = org.omg.CORBA.ValueMemberSeqHelper.read(in);
		result.initializers = org.omg.CORBA.InitializerSeqHelper.read(in);
		result.supported_interfaces = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.abstract_base_values = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.is_truncatable=in.read_boolean();
		result.base_value=in.read_string();
		result.type=in.read_TypeCode();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ValueDefPackage.FullValueDescription s)
	{
		out.write_string(s.name);
		out.write_string(s.id);
		out.write_boolean(s.is_abstract);
		out.write_boolean(s.is_custom);
		out.write_string(s.defined_in);
		out.write_string(s.version);
		org.omg.CORBA.OpDescriptionSeqHelper.write(out,s.operations);
		org.omg.CORBA.AttrDescriptionSeqHelper.write(out,s.attributes);
		org.omg.CORBA.ValueMemberSeqHelper.write(out,s.members);
		org.omg.CORBA.InitializerSeqHelper.write(out,s.initializers);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.supported_interfaces);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.abstract_base_values);
		out.write_boolean(s.is_truncatable);
		out.write_string(s.base_value);
		out.write_TypeCode(s.type);
	}
}
