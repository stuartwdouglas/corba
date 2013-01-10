package org.omg.RTCORBA;


/**
 * Generated from IDL struct "Protocol".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class ProtocolHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.RTCORBA.ProtocolHelper.id(),"Protocol",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protocol_type", org.omg.IOP.ProfileIdHelper.type(), null),new org.omg.CORBA.StructMember("orb_protocol_properties", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/RTCORBA/ProtocolProperties:1.0", "ProtocolProperties"), null),new org.omg.CORBA.StructMember("transport_protocol_properties", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/RTCORBA/ProtocolProperties:1.0", "ProtocolProperties"), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.RTCORBA.Protocol s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.RTCORBA.Protocol extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/RTCORBA/Protocol:1.0";
	}
	public static org.omg.RTCORBA.Protocol read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.RTCORBA.Protocol result = new org.omg.RTCORBA.Protocol();
		result.protocol_type=in.read_ulong();
		result.orb_protocol_properties=org.omg.RTCORBA.ProtocolPropertiesHelper.read(in);
		result.transport_protocol_properties=org.omg.RTCORBA.ProtocolPropertiesHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.RTCORBA.Protocol s)
	{
		out.write_ulong(s.protocol_type);
		org.omg.RTCORBA.ProtocolPropertiesHelper.write(out,s.orb_protocol_properties);
		org.omg.RTCORBA.ProtocolPropertiesHelper.write(out,s.transport_protocol_properties);
	}
}
