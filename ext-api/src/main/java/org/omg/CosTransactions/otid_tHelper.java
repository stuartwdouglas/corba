package org.omg.CosTransactions;


/**
 * Generated from IDL struct "otid_t".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class otid_tHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosTransactions.otid_tHelper.id(),"otid_t",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("formatID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("bqual_length", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("tid", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.otid_t s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTransactions.otid_t extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTransactions/otid_t:1.0";
	}
	public static org.omg.CosTransactions.otid_t read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTransactions.otid_t result = new org.omg.CosTransactions.otid_t();
		result.formatID=in.read_long();
		result.bqual_length=in.read_long();
		int _lresult_tid111 = in.read_long();
		try
		{
			 int x = in.available();
			 if ( x > 0 && _lresult_tid111 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lresult_tid111);
				}
		}
		catch (java.io.IOException e)
		{
		}
		result.tid = new byte[_lresult_tid111];
		in.read_octet_array(result.tid,0,_lresult_tid111);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTransactions.otid_t s)
	{
		out.write_long(s.formatID);
		out.write_long(s.bqual_length);
		
		out.write_long(s.tid.length);
		out.write_octet_array(s.tid,0,s.tid.length);
	}
}
