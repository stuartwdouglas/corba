package org.omg.dds;


/**
 * Generated from IDL interface "PublisherListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class PublisherListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.PublisherListenerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "on_offered_deadline_missed", new java.lang.Integer(0));
		m_opsHash.put ( "on_liveliness_lost", new java.lang.Integer(1));
		m_opsHash.put ( "on_offered_incompatible_qos", new java.lang.Integer(2));
		m_opsHash.put ( "on_publication_match", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/dds/PublisherListener:1.0","IDL:omg.org/dds/DataWriterListener:1.0","IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.PublisherListener _this()
	{
		return org.omg.dds.PublisherListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.PublisherListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.PublisherListenerHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // on_offered_deadline_missed
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.OfferedDeadlineMissedStatus _arg1=org.omg.dds.OfferedDeadlineMissedStatusHelper.read(_input);
				_out = handler.createReply();
				on_offered_deadline_missed(_arg0,_arg1);
				break;
			}
			case 1: // on_liveliness_lost
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.LivelinessLostStatus _arg1=org.omg.dds.LivelinessLostStatusHelper.read(_input);
				_out = handler.createReply();
				on_liveliness_lost(_arg0,_arg1);
				break;
			}
			case 2: // on_offered_incompatible_qos
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.OfferedIncompatibleQosStatus _arg1=org.omg.dds.OfferedIncompatibleQosStatusHelper.read(_input);
				_out = handler.createReply();
				on_offered_incompatible_qos(_arg0,_arg1);
				break;
			}
			case 3: // on_publication_match
			{
				org.omg.dds.DataWriter _arg0=org.omg.dds.DataWriterHelper.read(_input);
				org.omg.dds.PublicationMatchStatus _arg1=org.omg.dds.PublicationMatchStatusHelper.read(_input);
				_out = handler.createReply();
				on_publication_match(_arg0,_arg1);
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
