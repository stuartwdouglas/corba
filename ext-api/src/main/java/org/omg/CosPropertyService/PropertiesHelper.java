package org.omg.CosPropertyService;

/**
 * Generated from IDL alias "Properties".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class PropertiesHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosPropertyService.Property[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosPropertyService.Property[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosPropertyService.PropertiesHelper.id(), "Properties",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosPropertyService.PropertyHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosPropertyService/Properties:1.0";
	}
	public static org.omg.CosPropertyService.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosPropertyService.Property[] _result;
		int _l_result140 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result140 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result140);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CosPropertyService.Property[_l_result140];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosPropertyService.PropertyHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosPropertyService.Property[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CosPropertyService.PropertyHelper.write(_out,_s[i]);
		}

	}
}
