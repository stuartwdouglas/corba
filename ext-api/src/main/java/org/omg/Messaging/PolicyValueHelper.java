package org.omg.Messaging;


/**
 * Generated from IDL struct "PolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class PolicyValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Messaging.PolicyValueHelper.id(),"PolicyValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ptype", org.omg.CORBA.PolicyTypeHelper.type(), null),new org.omg.CORBA.StructMember("pvalue", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.PolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Messaging.PolicyValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Messaging/PolicyValue:1.0";
	}
	public static org.omg.Messaging.PolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Messaging.PolicyValue result = new org.omg.Messaging.PolicyValue();
		result.ptype=in.read_ulong();
		int _lresult_pvalue60 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_pvalue60 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_pvalue60);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.pvalue = new byte[_lresult_pvalue60];
		in.read_octet_array(result.pvalue,0,_lresult_pvalue60);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Messaging.PolicyValue s)
	{
		out.write_ulong(s.ptype);
		
		out.write_long(s.pvalue.length);
		out.write_octet_array(s.pvalue,0,s.pvalue.length);
	}
}
