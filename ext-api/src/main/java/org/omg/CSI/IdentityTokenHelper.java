package org.omg.CSI;

/**
 * Generated from IDL union "IdentityToken".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class IdentityTokenHelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.IdentityToken s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.IdentityToken extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/IdentityToken:1.0";
	}
	public static IdentityToken read (org.omg.CORBA.portable.InputStream in)
	{
		IdentityToken result = new IdentityToken ();
		int disc=in.read_ulong();
		switch (disc)
		{
			case 0:
			{
				boolean _var;
				_var=in.read_boolean();
				result.absent (_var);
				break;
			}
			case 1:
			{
				boolean _var;
				_var=in.read_boolean();
				result.anonymous (_var);
				break;
			}
			case 2:
			{
				byte[] _var;
				_var = org.omg.CSI.GSS_NT_ExportedNameHelper.read(in);
				result.principal_name (_var);
				break;
			}
			case 4:
			{
				byte[] _var;
				_var = org.omg.CSI.X509CertificateChainHelper.read(in);
				result.certificate_chain (_var);
				break;
			}
			case 8:
			{
				byte[] _var;
				_var = org.omg.CSI.X501DistinguishedNameHelper.read(in);
				result.dn (_var);
				break;
			}
			default:
			{
				byte[] _var;
				_var = org.omg.CSI.IdentityExtensionHelper.read(in);
				result.id (_var);
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, IdentityToken s)
	{
		out.write_ulong(s.discriminator ());
		switch (s.discriminator ())
		{
			case 0:
			{
				out.write_boolean(s.absent ());
				break;
			}
			case 1:
			{
				out.write_boolean(s.anonymous ());
				break;
			}
			case 2:
			{
				org.omg.CSI.GSS_NT_ExportedNameHelper.write(out,s.principal_name ());
				break;
			}
			case 4:
			{
				org.omg.CSI.X509CertificateChainHelper.write(out,s.certificate_chain ());
				break;
			}
			case 8:
			{
				org.omg.CSI.X501DistinguishedNameHelper.write(out,s.dn ());
				break;
			}
			default:
			{
				org.omg.CSI.IdentityExtensionHelper.write(out,s.id ());
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[6];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (0);
			members[0] = new org.omg.CORBA.UnionMember ("absent", label_any, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (1);
			members[1] = new org.omg.CORBA.UnionMember ("anonymous", label_any, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (2);
			members[2] = new org.omg.CORBA.UnionMember ("principal_name", label_any, org.omg.CSI.GSS_NT_ExportedNameHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (4);
			members[3] = new org.omg.CORBA.UnionMember ("certificate_chain", label_any, org.omg.CSI.X509CertificateChainHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (8);
			members[4] = new org.omg.CORBA.UnionMember ("dn", label_any, org.omg.CSI.X501DistinguishedNameHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_octet ((byte)0);
			members[5] = new org.omg.CORBA.UnionMember ("id", label_any, org.omg.CSI.IdentityExtensionHelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"IdentityToken",org.omg.CSI.IdentityTokenTypeHelper.type(), members);
		}
		return _type;
	}
}
