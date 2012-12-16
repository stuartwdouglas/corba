package org.omg.CSIIOP;


/**
 * Generated from IDL struct "SAS_ContextSec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SAS_ContextSecHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.SAS_ContextSecHelper.id(),"SAS_ContextSec",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("target_requires", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("privilege_authorities", org.omg.CSIIOP.ServiceConfigurationListHelper.type(), null),new org.omg.CORBA.StructMember("supported_naming_mechanisms", org.omg.CSI.OIDListHelper.type(), null),new org.omg.CORBA.StructMember("supported_identity_types", org.omg.CSI.IdentityTokenTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.SAS_ContextSec s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.SAS_ContextSec extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/SAS_ContextSec:1.0";
	}
	public static org.omg.CSIIOP.SAS_ContextSec read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.SAS_ContextSec result = new org.omg.CSIIOP.SAS_ContextSec();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.privilege_authorities = org.omg.CSIIOP.ServiceConfigurationListHelper.read(in);
		result.supported_naming_mechanisms = org.omg.CSI.OIDListHelper.read(in);
		result.supported_identity_types=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.SAS_ContextSec s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		org.omg.CSIIOP.ServiceConfigurationListHelper.write(out,s.privilege_authorities);
		org.omg.CSI.OIDListHelper.write(out,s.supported_naming_mechanisms);
		out.write_ulong(s.supported_identity_types);
	}
}
