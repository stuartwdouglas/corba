package org.omg.IOP;


/**
 * Generated from IDL struct "IOR".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class IORHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.IORHelper.id(),"IOR",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type_id", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("profiles", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.IOP.TaggedProfileHelper.type()), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IOP.IOR s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IOP.IOR extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IOP/IOR:1.0";
	}
	public static org.omg.IOP.IOR read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IOP.IOR result = new org.omg.IOP.IOR();
		result.type_id=in.read_string();
		int _lresult_profiles42 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_profiles42 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_profiles42);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.profiles = new org.omg.IOP.TaggedProfile[_lresult_profiles42];
		for (int i=0;i<result.profiles.length;i++)
		{
			result.profiles[i]=org.omg.IOP.TaggedProfileHelper.read(in);
		}

		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IOP.IOR s)
	{
		out.write_string(s.type_id);
		
		out.write_long(s.profiles.length);
		for (int i=0; i<s.profiles.length;i++)
		{
			org.omg.IOP.TaggedProfileHelper.write(out,s.profiles[i]);
		}

	}
}
