package org.omg.CORBA;


/**
 * Generated from IDL exception "InvalidPolicies".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class InvalidPoliciesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CORBA.InvalidPoliciesHelper.id(),"InvalidPolicies",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("indices", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.InvalidPolicies s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.InvalidPolicies extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/InvalidPolicies:1.0";
	}
	public static org.omg.CORBA.InvalidPolicies read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		short[] x0;
		int _lx02 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lx02 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lx02);
				}
		}
		catch (java.io.IOException e)
		{
		}
		x0 = new short[_lx02];
		in.read_ushort_array(x0,0,_lx02);
		final org.omg.CORBA.InvalidPolicies result = new org.omg.CORBA.InvalidPolicies(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.InvalidPolicies s)
	{
		out.write_string(id());
		
		out.write_long(s.indices.length);
		out.write_ushort_array(s.indices,0,s.indices.length);
	}
}
