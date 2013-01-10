package org.omg.CORBA;


/**
 * Generated from IDL struct "AttributeDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class AttributeDescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.AttributeDescriptionHelper.id(),"AttributeDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.IdentifierHelper.type(), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.RepositoryIdHelper.type(), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.VersionSpecHelper.type(), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.AttributeModeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.AttributeDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.AttributeDescription extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/AttributeDescription:1.0";
	}
	public static org.omg.CORBA.AttributeDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.AttributeDescription result = new org.omg.CORBA.AttributeDescription();
		result.name=in.read_string();
		result.id=in.read_string();
		result.defined_in=in.read_string();
		result.version=in.read_string();
		result.type=in.read_TypeCode();
		result.mode=org.omg.CORBA.AttributeModeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.AttributeDescription s)
	{
		out.write_string(s.name);
		out.write_string(s.id);
		out.write_string(s.defined_in);
		out.write_string(s.version);
		out.write_TypeCode(s.type);
		org.omg.CORBA.AttributeModeHelper.write(out,s.mode);
	}
}
