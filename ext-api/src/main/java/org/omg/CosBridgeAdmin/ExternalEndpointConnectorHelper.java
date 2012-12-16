package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL union "ExternalEndpointConnector".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointConnectorHelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.ExternalEndpointConnector s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.ExternalEndpointConnector extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/ExternalEndpointConnector:1.0";
	}
	public static ExternalEndpointConnector read (org.omg.CORBA.portable.InputStream in)
	{
		ExternalEndpointConnector result = new ExternalEndpointConnector ();
		org.omg.CosBridgeAdmin.MessageType disc = org.omg.CosBridgeAdmin.MessageType.from_int(in.read_long());
		switch (disc.value ())
		{
			case org.omg.CosBridgeAdmin.MessageType._JMS_MESSAGE:
			{
				org.omg.CosBridgeAdmin.JMSDestination _var;
				_var=org.omg.CosBridgeAdmin.JMSDestinationHelper.read(in);
				result.destination (_var);
				break;
			}
			default:
			{
				int _var;
				_var=in.read_long();
				result.channel_id (_var);
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, ExternalEndpointConnector s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case org.omg.CosBridgeAdmin.MessageType._JMS_MESSAGE:
			{
				org.omg.CosBridgeAdmin.JMSDestinationHelper.write(out,s.destination ());
				break;
			}
			default:
			{
				out.write_long(s.channel_id ());
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.CosBridgeAdmin.MessageTypeHelper.insert(label_any, org.omg.CosBridgeAdmin.MessageType.JMS_MESSAGE);
			members[0] = new org.omg.CORBA.UnionMember ("destination", label_any, org.omg.CosBridgeAdmin.JMSDestinationHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_octet ((byte)0);
			members[1] = new org.omg.CORBA.UnionMember ("channel_id", label_any, org.omg.CosNotifyChannelAdmin.ChannelIDHelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"ExternalEndpointConnector",org.omg.CosBridgeAdmin.MessageTypeHelper.type(), members);
		}
		return _type;
	}
}
