package org.omg.CosCollection;

/**
 * Generated from IDL alias "ParameterList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class ParameterListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosCollection.NVPair[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosCollection.NVPair[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosCollection.ParameterListHelper.id(), "ParameterList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosCollection.NVPairHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosCollection/ParameterList:1.0";
	}
	public static org.omg.CosCollection.NVPair[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosCollection.NVPair[] _result;
		int _l_result114 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result114 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result114);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CosCollection.NVPair[_l_result114];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosCollection.NVPairHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosCollection.NVPair[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CosCollection.NVPairHelper.write(_out,_s[i]);
		}

	}
}
