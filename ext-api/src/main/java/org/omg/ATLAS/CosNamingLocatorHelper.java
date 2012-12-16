package org.omg.ATLAS;


/**
 * Generated from IDL struct "CosNamingLocator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:41 PM
 */

public final class CosNamingLocatorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.ATLAS.CosNamingLocatorHelper.id(),"CosNamingLocator",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name_service", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNaming/NamingContext:1.0", "NamingContext"), null),new org.omg.CORBA.StructMember("the_name", org.omg.CosNaming.NameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.ATLAS.CosNamingLocator s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.ATLAS.CosNamingLocator extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/CosNamingLocator:1.0";
	}
	public static org.omg.ATLAS.CosNamingLocator read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.ATLAS.CosNamingLocator result = new org.omg.ATLAS.CosNamingLocator();
		result.name_service=org.omg.CosNaming.NamingContextHelper.read(in);
		result.the_name = org.omg.CosNaming.NameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.ATLAS.CosNamingLocator s)
	{
		org.omg.CosNaming.NamingContextHelper.write(out,s.name_service);
		org.omg.CosNaming.NameHelper.write(out,s.the_name);
	}
}
