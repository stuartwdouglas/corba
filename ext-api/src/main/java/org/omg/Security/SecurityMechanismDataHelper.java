package org.omg.Security;


/**
 * Generated from IDL struct "SecurityMechanismData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecurityMechanismDataHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.SecurityMechanismDataHelper.id(),"SecurityMechanismData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("mechanism", org.omg.Security.MechanismTypeHelper.type(), null),new org.omg.CORBA.StructMember("security_name", org.omg.Security.SecurityNameHelper.type(), null),new org.omg.CORBA.StructMember("options_supported", org.omg.Security.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("options_required", org.omg.Security.AssociationOptionsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.SecurityMechanismData s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.SecurityMechanismData extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SecurityMechanismData:1.0";
	}
	public static org.omg.Security.SecurityMechanismData read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.SecurityMechanismData result = new org.omg.Security.SecurityMechanismData();
		result.mechanism=in.read_string();
		result.security_name=in.read_string();
		result.options_supported=in.read_ushort();
		result.options_required=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.SecurityMechanismData s)
	{
		out.write_string(s.mechanism);
		out.write_string(s.security_name);
		out.write_ushort(s.options_supported);
		out.write_ushort(s.options_required);
	}
}
