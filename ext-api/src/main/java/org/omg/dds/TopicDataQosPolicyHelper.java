package org.omg.dds;


/**
 * Generated from IDL struct "TopicDataQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class TopicDataQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.TopicDataQosPolicyHelper.id(),"TopicDataQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.TopicDataQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.TopicDataQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/TopicDataQosPolicy:1.0";
	}
	public static org.omg.dds.TopicDataQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.TopicDataQosPolicy result = new org.omg.dds.TopicDataQosPolicy();
		int _lresult_value108 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_value108 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_value108);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.value = new byte[_lresult_value108];
		in.read_octet_array(result.value,0,_lresult_value108);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.TopicDataQosPolicy s)
	{
		
		out.write_long(s.value.length);
		out.write_octet_array(s.value,0,s.value.length);
	}
}
