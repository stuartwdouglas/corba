package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyNames".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public final class PropertyNamesHelper
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
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosPropertyService.PropertyNamesHelper.id(), "PropertyNames",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosPropertyService.PropertyNameHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyNames:1.0";
	}
	public static java.lang.String[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		java.lang.String[] _result;
		int _l_result139 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result139 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result139);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new java.lang.String[_l_result139];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_string();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, java.lang.String[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_string(_s[i]);
		}

	}
}