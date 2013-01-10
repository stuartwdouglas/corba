package org.omg.Security;


/**
 * Generated from IDL struct "AttributeType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AttributeTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.AttributeTypeHelper.id(),"AttributeType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("attribute_family", org.omg.Security.ExtensibleFamilyHelper.type(), null),new org.omg.CORBA.StructMember("attribute_type", org.omg.Security.SecurityAttributeTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.AttributeType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.AttributeType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/AttributeType:1.0";
	}
	public static org.omg.Security.AttributeType read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.AttributeType result = new org.omg.Security.AttributeType();
		result.attribute_family=org.omg.Security.ExtensibleFamilyHelper.read(in);
		result.attribute_type=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.AttributeType s)
	{
		org.omg.Security.ExtensibleFamilyHelper.write(out,s.attribute_family);
		out.write_ulong(s.attribute_type);
	}
}
