package org.omg.CORBA;

/**
 * Generated from IDL alias "WStringSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class WStringSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, java.lang.String[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static java.lang.String[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.WStringSeqHelper.id(), "WStringSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_wstring_tc(0)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/WStringSeq:1.0";
	}
	public static java.lang.String[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		java.lang.String[] _result;
		int _l_result5 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result5 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result5);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new java.lang.String[_l_result5];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_wstring();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, java.lang.String[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_wstring(_s[i]);
		}

	}
}
