package org.omg.ATLAS;


/**
 * Generated from IDL struct "AuthTokenData".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class AuthTokenDataHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.ATLAS.AuthTokenDataHelper.id(),"AuthTokenData",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ident_token", org.omg.ATLAS.IdTokenOptionHelper.type(), null),new org.omg.CORBA.StructMember("auth_token", org.omg.CSI.AuthorizationTokenHelper.type(), null),new org.omg.CORBA.StructMember("expiry_time", org.omg.ATLAS.ExpiryTimeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.ATLAS.AuthTokenData s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.ATLAS.AuthTokenData extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/AuthTokenData:1.0";
	}
	public static org.omg.ATLAS.AuthTokenData read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.ATLAS.AuthTokenData result = new org.omg.ATLAS.AuthTokenData();
		result.ident_token = org.omg.ATLAS.IdTokenOptionHelper.read(in);
		result.auth_token = org.omg.CSI.AuthorizationTokenHelper.read(in);
		result.expiry_time = org.omg.ATLAS.ExpiryTimeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.ATLAS.AuthTokenData s)
	{
		org.omg.ATLAS.IdTokenOptionHelper.write(out,s.ident_token);
		org.omg.CSI.AuthorizationTokenHelper.write(out,s.auth_token);
		org.omg.ATLAS.ExpiryTimeHelper.write(out,s.expiry_time);
	}
}
