package org.omg.IOP;


/**
 * Generated from IDL struct "ServiceContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class ServiceContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IOP.ServiceContextHelper.id(),"ServiceContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("context_id", org.omg.IOP.ServiceIdHelper.type(), null),new org.omg.CORBA.StructMember("context_data", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IOP.ServiceContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IOP.ServiceContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IOP/ServiceContext:1.0";
	}
	public static org.omg.IOP.ServiceContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IOP.ServiceContext result = new org.omg.IOP.ServiceContext();
		result.context_id=in.read_ulong();
		int _lresult_context_data46 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_context_data46 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_context_data46);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.context_data = new byte[_lresult_context_data46];
		in.read_octet_array(result.context_data,0,_lresult_context_data46);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IOP.ServiceContext s)
	{
		out.write_ulong(s.context_id);
		
		out.write_long(s.context_data.length);
		out.write_octet_array(s.context_data,0,s.context_data.length);
	}
}
