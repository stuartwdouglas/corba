package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "PropertyTypes".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertyTypesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.TypeCode[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.TypeCode[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosPropertyService.PropertyTypesHelper.id(), "PropertyTypes",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/PropertyTypes:1.0";
	}
	public static org.omg.CORBA.TypeCode[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.TypeCode[] _result;
		int _l_result143 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result143 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result143);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.TypeCode[_l_result143];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_TypeCode();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.TypeCode[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_TypeCode(_s[i]);
		}

	}
}
