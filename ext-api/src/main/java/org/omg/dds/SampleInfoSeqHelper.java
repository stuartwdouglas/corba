package org.omg.dds;

/**
 * Generated from IDL alias "SampleInfoSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleInfoSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.dds.SampleInfo[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.dds.SampleInfo[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.SampleInfoSeqHelper.id(), "SampleInfoSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.dds.SampleInfoHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/dds/SampleInfoSeq:1.0";
	}
	public static org.omg.dds.SampleInfo[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.dds.SampleInfo[] _result;
		int _l_result110 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result110 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result110);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.dds.SampleInfo[_l_result110];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.dds.SampleInfoHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.dds.SampleInfo[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.dds.SampleInfoHelper.write(_out,_s[i]);
		}

	}
}
