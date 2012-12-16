package org.omg.IOP;


/**
 * Generated from IDL struct "TaggedProfile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedProfileHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.TaggedProfileHelper.id(),"TaggedProfile",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tag", org.omg.IOP.ProfileIdHelper.type(), null),new org.omg.CORBA.StructMember("profile_data", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IOP.TaggedProfile s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IOP.TaggedProfile extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IOP/TaggedProfile:1.0";
	}
	public static org.omg.IOP.TaggedProfile read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IOP.TaggedProfile result = new org.omg.IOP.TaggedProfile();
		result.tag=in.read_ulong();
		int _lresult_profile_data41 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_profile_data41 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_profile_data41);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.profile_data = new byte[_lresult_profile_data41];
		in.read_octet_array(result.profile_data,0,_lresult_profile_data41);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IOP.TaggedProfile s)
	{
		out.write_ulong(s.tag);
		
		out.write_long(s.profile_data.length);
		out.write_octet_array(s.profile_data,0,s.profile_data.length);
	}
}
