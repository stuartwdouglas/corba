package org.omg.CORBA.ContainerPackage;


/**
 * Generated from IDL struct "Description".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class DescriptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ContainerPackage.DescriptionHelper.id(),"Description",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("contained_object", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Contained:1.0", "Contained"), null),new org.omg.CORBA.StructMember("kind", org.omg.CORBA.DefinitionKindHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ContainerPackage.Description s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ContainerPackage.Description extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/Container/Description:1.0";
	}
	public static org.omg.CORBA.ContainerPackage.Description read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ContainerPackage.Description result = new org.omg.CORBA.ContainerPackage.Description();
		result.contained_object=org.omg.CORBA.ContainedHelper.read(in);
		result.kind=org.omg.CORBA.DefinitionKindHelper.read(in);
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ContainerPackage.Description s)
	{
		org.omg.CORBA.ContainedHelper.write(out,s.contained_object);
		org.omg.CORBA.DefinitionKindHelper.write(out,s.kind);
		out.write_any(s.value);
	}
}
