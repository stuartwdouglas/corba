package org.omg.Security;
/**
 * Generated from IDL enum "SecurityFeature".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SecurityFeatureHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.SecurityFeatureHelper.id(),"SecurityFeature",new String[]{"SecNoDelegation","SecSimpleDelegation","SecCompositeDelegation","SecNoProtection","SecIntegrity","SecConfidentiality","SecIntegrityAndConfidentiality","SecDetectReplay","SecDetectMisordering","SecEstablishTrustInTarget","SecEstablishTrustInClient"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.SecurityFeature s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.SecurityFeature extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SecurityFeature:1.0";
	}
	public static SecurityFeature read (final org.omg.CORBA.portable.InputStream in)
	{
		return SecurityFeature.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SecurityFeature s)
	{
		out.write_long(s.value());
	}
}