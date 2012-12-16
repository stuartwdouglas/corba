package org.omg.PortableServer;

/**
 * Generated from IDL alias "ObjectId".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ObjectIdHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, byte[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static byte[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.PortableServer.ObjectIdHelper.id(), "ObjectId",org.omg.CORBA.OctetSeqHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/PortableServer/ObjectId:1.0";
	}
	public static byte[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		byte[] _result;
		_result = org.omg.CORBA.OctetSeqHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, byte[] _s)
	{
		org.omg.CORBA.OctetSeqHelper.write(_out,_s);
	}
}
