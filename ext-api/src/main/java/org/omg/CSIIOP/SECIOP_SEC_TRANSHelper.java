package org.omg.CSIIOP;


/**
 * Generated from IDL struct "SECIOP_SEC_TRANS".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SECIOP_SEC_TRANSHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.SECIOP_SEC_TRANSHelper.id(),"SECIOP_SEC_TRANS",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("target_requires", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("mech_oid", org.omg.CSI.OIDHelper.type(), null),new org.omg.CORBA.StructMember("target_name", org.omg.CSI.GSS_NT_ExportedNameHelper.type(), null),new org.omg.CORBA.StructMember("addresses", org.omg.CSIIOP.TransportAddressListHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.SECIOP_SEC_TRANS s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.SECIOP_SEC_TRANS extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/SECIOP_SEC_TRANS:1.0";
	}
	public static org.omg.CSIIOP.SECIOP_SEC_TRANS read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.SECIOP_SEC_TRANS result = new org.omg.CSIIOP.SECIOP_SEC_TRANS();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.mech_oid = org.omg.CSI.OIDHelper.read(in);
		result.target_name = org.omg.CSI.GSS_NT_ExportedNameHelper.read(in);
		result.addresses = org.omg.CSIIOP.TransportAddressListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.SECIOP_SEC_TRANS s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		org.omg.CSI.OIDHelper.write(out,s.mech_oid);
		org.omg.CSI.GSS_NT_ExportedNameHelper.write(out,s.target_name);
		org.omg.CSIIOP.TransportAddressListHelper.write(out,s.addresses);
	}
}
