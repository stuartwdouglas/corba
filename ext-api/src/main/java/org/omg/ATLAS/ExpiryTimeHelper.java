package org.omg.ATLAS;

/**
 * Generated from IDL alias "ExpiryTime".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ExpiryTimeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.TimeBase.UtcT[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.TimeBase.UtcT[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.ATLAS.ExpiryTimeHelper.id(), "ExpiryTime",org.omg.CORBA.ORB.init().create_sequence_tc(1, org.omg.TimeBase.UtcTHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/ExpiryTime:1.0";
	}
	public static org.omg.TimeBase.UtcT[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.TimeBase.UtcT[] _result;
		int _l_result94 = _in.read_long();
		if (_l_result94 > 1)
			throw new org.omg.CORBA.MARSHAL("Sequence length incorrect!");
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result94 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result94);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.TimeBase.UtcT[_l_result94];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.TimeBase.UtcTHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.TimeBase.UtcT[] _s)
	{
				if (_s.length > 1)
			throw new org.omg.CORBA.MARSHAL("Incorrect sequence length");
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.TimeBase.UtcTHelper.write(_out,_s[i]);
		}

	}
}
