package org.omg.ATLAS;


/**
 * Generated from IDL struct "ATLASProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ATLASProfileHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.ATLAS.ATLASProfileHelper.id(),"ATLASProfile",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_locator", org.omg.ATLAS.ATLASLocatorHelper.type(), null),new org.omg.CORBA.StructMember("the_cache_id", org.omg.ATLAS.ATLASCacheIdHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.ATLAS.ATLASProfile s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.ATLAS.ATLASProfile extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/ATLASProfile:1.0";
	}
	public static org.omg.ATLAS.ATLASProfile read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.ATLAS.ATLASProfile result = new org.omg.ATLAS.ATLASProfile();
		result.the_locator=org.omg.ATLAS.ATLASLocatorHelper.read(in);
		result.the_cache_id = org.omg.ATLAS.ATLASCacheIdHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.ATLAS.ATLASProfile s)
	{
		org.omg.ATLAS.ATLASLocatorHelper.write(out,s.the_locator);
		org.omg.ATLAS.ATLASCacheIdHelper.write(out,s.the_cache_id);
	}
}
