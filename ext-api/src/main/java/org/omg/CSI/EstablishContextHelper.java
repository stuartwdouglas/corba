package org.omg.CSI;


/**
 * Generated from IDL struct "EstablishContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class EstablishContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSI.EstablishContextHelper.id(),"EstablishContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("client_context_id", org.omg.CSI.ContextIdHelper.type(), null),new org.omg.CORBA.StructMember("authorization_token", org.omg.CSI.AuthorizationTokenHelper.type(), null),new org.omg.CORBA.StructMember("identity_token", org.omg.CSI.IdentityTokenHelper.type(), null),new org.omg.CORBA.StructMember("client_authentication_token", org.omg.CSI.GSSTokenHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.EstablishContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.EstablishContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/EstablishContext:1.0";
	}
	public static org.omg.CSI.EstablishContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSI.EstablishContext result = new org.omg.CSI.EstablishContext();
		result.client_context_id=in.read_ulonglong();
		result.authorization_token = org.omg.CSI.AuthorizationTokenHelper.read(in);
		result.identity_token=org.omg.CSI.IdentityTokenHelper.read(in);
		result.client_authentication_token = org.omg.CSI.GSSTokenHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSI.EstablishContext s)
	{
		out.write_ulonglong(s.client_context_id);
		org.omg.CSI.AuthorizationTokenHelper.write(out,s.authorization_token);
		org.omg.CSI.IdentityTokenHelper.write(out,s.identity_token);
		org.omg.CSI.GSSTokenHelper.write(out,s.client_authentication_token);
	}
}
