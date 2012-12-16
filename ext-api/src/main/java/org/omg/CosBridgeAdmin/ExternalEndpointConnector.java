package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL union "ExternalEndpointConnector".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointConnector
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.CosBridgeAdmin.MessageType discriminator;
	private org.omg.CosBridgeAdmin.JMSDestination destination;
	private int channel_id;

	public ExternalEndpointConnector ()
	{
	}

	public org.omg.CosBridgeAdmin.MessageType discriminator ()
	{
		return discriminator;
	}

	public org.omg.CosBridgeAdmin.JMSDestination destination ()
	{
		if (discriminator != org.omg.CosBridgeAdmin.MessageType.JMS_MESSAGE)
			throw new org.omg.CORBA.BAD_OPERATION();
		return destination;
	}

	public void destination (org.omg.CosBridgeAdmin.JMSDestination _x)
	{
		discriminator = org.omg.CosBridgeAdmin.MessageType.JMS_MESSAGE;
		destination = _x;
	}

	public int channel_id ()
	{
		if (discriminator != org.omg.CosBridgeAdmin.MessageType.STRUCTURED_EVENT && discriminator != org.omg.CosBridgeAdmin.MessageType.SEQUENCE_EVENT)
			throw new org.omg.CORBA.BAD_OPERATION();
		return channel_id;
	}

	public void channel_id (int _x)
	{
		discriminator = org.omg.CosBridgeAdmin.MessageType.STRUCTURED_EVENT;
		channel_id = _x;
	}

	public void channel_id (org.omg.CosBridgeAdmin.MessageType _discriminator, int _x)
	{
		if (_discriminator != org.omg.CosBridgeAdmin.MessageType.STRUCTURED_EVENT && discriminator != org.omg.CosBridgeAdmin.MessageType.SEQUENCE_EVENT)
			throw new org.omg.CORBA.BAD_OPERATION();
		discriminator = _discriminator;
		channel_id = _x;
	}

}
