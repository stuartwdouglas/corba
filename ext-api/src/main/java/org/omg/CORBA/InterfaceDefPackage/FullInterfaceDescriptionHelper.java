package org.omg.CORBA.InterfaceDefPackage;


/**
 * Generated from IDL struct "FullInterfaceDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class FullInterfaceDescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.id(),"FullInterfaceDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.VersionSpecHelper.type(), null),new org.omg.CORBA.StructMember("operations", org.omg.CORBA.OpDescriptionSeqHelper.type(), null),new org.omg.CORBA.StructMember("attributes", org.omg.CORBA.AttrDescriptionSeqHelper.type(), null),new org.omg.CORBA.StructMember("base_interfaces", org.omg.CORBA.RepositoryIdSeqHelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("is_abstract", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/InterfaceDef/FullInterfaceDescription:1.0";
	}
	public static org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription result = new org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription();
		result.name=in.read_string();
		result.id=in.read_string();
		result.defined_in=in.read_string();
		result.version=in.read_string();
		result.operations = org.omg.CORBA.OpDescriptionSeqHelper.read(in);
		result.attributes = org.omg.CORBA.AttrDescriptionSeqHelper.read(in);
		result.base_interfaces = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.type=in.read_TypeCode();
		result.is_abstract=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription s)
	{
		out.write_string(s.name);
		out.write_string(s.id);
		out.write_string(s.defined_in);
		out.write_string(s.version);
		org.omg.CORBA.OpDescriptionSeqHelper.write(out,s.operations);
		org.omg.CORBA.AttrDescriptionSeqHelper.write(out,s.attributes);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.base_interfaces);
		out.write_TypeCode(s.type);
		out.write_boolean(s.is_abstract);
	}
}
