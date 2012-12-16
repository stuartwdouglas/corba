package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public abstract class PullSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyComm.PullSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disconnect_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "subscription_change", new java.lang.Integer(1));
		m_opsHash.put ( "pull", new java.lang.Integer(2));
		m_opsHash.put ( "try_pull", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyComm/PullSupplier:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosEventComm/PullSupplier:1.0"};
	public org.omg.CosNotifyComm.PullSupplier _this()
	{
		return org.omg.CosNotifyComm.PullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.PullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.PullSupplierHelper.narrow(_this_object(orb));
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
			case 0: // disconnect_pull_supplier
			{
				_out = handler.createReply();
				disconnect_pull_supplier();
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
			case 2: // pull
			{
			try
			{
				_out = handler.createReply();
				_out.write_any(pull());
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // try_pull
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_any(try_pull(_arg0));
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
