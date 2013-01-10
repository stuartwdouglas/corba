package org.omg.Security;


/**
 * Generated from IDL struct "SecAttribute".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecAttributeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.SecAttributeHelper.id(),"SecAttribute",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("attribute_type", org.omg.Security.AttributeTypeHelper.type(), null),new org.omg.CORBA.StructMember("defining_authority", org.omg.Security.OpaqueHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.Security.OpaqueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.SecAttribute s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.SecAttribute extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SecAttribute:1.0";
	}
	public static org.omg.Security.SecAttribute read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.SecAttribute result = new org.omg.Security.SecAttribute();
		result.attribute_type=org.omg.Security.AttributeTypeHelper.read(in);
		result.defining_authority = org.omg.Security.OpaqueHelper.read(in);
		result.value = org.omg.Security.OpaqueHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.SecAttribute s)
	{
		org.omg.Security.AttributeTypeHelper.write(out,s.attribute_type);
		org.omg.Security.OpaqueHelper.write(out,s.defining_authority);
		org.omg.Security.OpaqueHelper.write(out,s.value);
	}
}
