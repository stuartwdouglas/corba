package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL alias "AdminIDSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class AdminIDSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, int[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static int[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotifyChannelAdmin.AdminIDSeqHelper.id(), "AdminIDSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosNotifyChannelAdmin.AdminIDHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/AdminIDSeq:1.0";
	}
	public static int[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		int[] _result;
		int _l_result126 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result126 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result126);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new int[_l_result126];
		_in.read_long_array(_result,0,_l_result126);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, int[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_long_array(_s,0,_s.length);
	}
}
