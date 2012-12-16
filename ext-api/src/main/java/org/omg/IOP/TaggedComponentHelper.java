package org.omg.IOP;


/**
 * Generated from IDL struct "TaggedComponent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class TaggedComponentHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.TaggedComponentHelper.id(),"TaggedComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tag", org.omg.IOP.ComponentIdHelper.type(), null),new org.omg.CORBA.StructMember("component_data", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IOP.TaggedComponent s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IOP.TaggedComponent extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IOP/TaggedComponent:1.0";
	}
	public static org.omg.IOP.TaggedComponent read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IOP.TaggedComponent result = new org.omg.IOP.TaggedComponent();
		result.tag=in.read_ulong();
		int _lresult_component_data43 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_component_data43 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_component_data43);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.component_data = new byte[_lresult_component_data43];
		in.read_octet_array(result.component_data,0,_lresult_component_data43);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IOP.TaggedComponent s)
	{
		out.write_ulong(s.tag);
		
		out.write_long(s.component_data.length);
		out.write_octet_array(s.component_data,0,s.component_data.length);
	}
}
