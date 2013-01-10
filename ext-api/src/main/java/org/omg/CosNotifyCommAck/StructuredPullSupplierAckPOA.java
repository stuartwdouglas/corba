package org.omg.CosNotifyCommAck;


/**
 * Generated from IDL interface "StructuredPullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public abstract class StructuredPullSupplierAckPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyCommAck.StructuredPullSupplierAckOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disconnect_structured_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "subscription_change", new java.lang.Integer(1));
		m_opsHash.put ( "acknowledge", new java.lang.Integer(2));
		m_opsHash.put ( "pull_structured_event", new java.lang.Integer(3));
		m_opsHash.put ( "try_pull_structured_event", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyCommAck/StructuredPullSupplierAck:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0"};
	public org.omg.CosNotifyCommAck.StructuredPullSupplierAck _this()
	{
		return org.omg.CosNotifyCommAck.StructuredPullSupplierAckHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyCommAck.StructuredPullSupplierAck _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyCommAck.StructuredPullSupplierAckHelper.narrow(_this_object(orb));
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
			case 0: // disconnect_structured_pull_supplier
			{
				_out = handler.createReply();
				disconnect_structured_pull_supplier();
				break;
			}
			case 1: // subscription_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				subscription_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // acknowledge
			{
				int[] _arg0=org.omg.CosNotifyCommAck.SequenceNumbersHelper.read(_input);
				_out = handler.createReply();
				acknowledge(_arg0);
				break;
			}
			case 3: // pull_structured_event
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosNotification.StructuredEventHelper.write(_out,pull_structured_event());
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // try_pull_structured_event
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				org.omg.CosNotification.StructuredEventHelper.write(_out,try_pull_structured_event(_arg0));
				_out.write_boolean(_arg0.value);
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
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
