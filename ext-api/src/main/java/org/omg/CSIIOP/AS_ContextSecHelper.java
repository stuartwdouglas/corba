package org.omg.CSIIOP;


/**
 * Generated from IDL struct "AS_ContextSec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AS_ContextSecHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.AS_ContextSecHelper.id(),"AS_ContextSec",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("target_requires", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("client_authentication_mech", org.omg.CSI.OIDHelper.type(), null),new org.omg.CORBA.StructMember("target_name", org.omg.CSI.GSS_NT_ExportedNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.AS_ContextSec s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.AS_ContextSec extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/AS_ContextSec:1.0";
	}
	public static org.omg.CSIIOP.AS_ContextSec read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.AS_ContextSec result = new org.omg.CSIIOP.AS_ContextSec();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.client_authentication_mech = org.omg.CSI.OIDHelper.read(in);
		result.target_name = org.omg.CSI.GSS_NT_ExportedNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.AS_ContextSec s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		org.omg.CSI.OIDHelper.write(out,s.client_authentication_mech);
		org.omg.CSI.GSS_NT_ExportedNameHelper.write(out,s.target_name);
	}
}
