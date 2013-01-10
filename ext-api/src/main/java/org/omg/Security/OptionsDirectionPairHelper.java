package org.omg.Security;


/**
 * Generated from IDL struct "OptionsDirectionPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class OptionsDirectionPairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.OptionsDirectionPairHelper.id(),"OptionsDirectionPair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("options", org.omg.Security.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.Security.CommunicationDirectionHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.OptionsDirectionPair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.OptionsDirectionPair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/OptionsDirectionPair:1.0";
	}
	public static org.omg.Security.OptionsDirectionPair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.OptionsDirectionPair result = new org.omg.Security.OptionsDirectionPair();
		result.options=in.read_ushort();
		result.direction=org.omg.Security.CommunicationDirectionHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.OptionsDirectionPair s)
	{
		out.write_ushort(s.options);
		org.omg.Security.CommunicationDirectionHelper.write(out,s.direction);
	}
}
