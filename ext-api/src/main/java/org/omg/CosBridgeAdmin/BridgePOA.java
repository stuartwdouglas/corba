package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "Bridge".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public abstract class BridgePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosBridgeAdmin.BridgeOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "start_bridge", new java.lang.Integer(0));
		m_opsHash.put ( "stop_bridge", new java.lang.Integer(1));
		m_opsHash.put ( "_get_end_point_receiver", new java.lang.Integer(2));
		m_opsHash.put ( "_get_end_point_sender", new java.lang.Integer(3));
		m_opsHash.put ( "destroy", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/CosBridgeAdmin/Bridge:1.0"};
	public org.omg.CosBridgeAdmin.Bridge _this()
	{
		return org.omg.CosBridgeAdmin.BridgeHelper.narrow(_this_object());
	}
	public org.omg.CosBridgeAdmin.Bridge _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosBridgeAdmin.BridgeHelper.narrow(_this_object(orb));
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
			case 0: // start_bridge
			{
			try
			{
				_out = handler.createReply();
				start_bridge();
			}
			catch(org.omg.CosBridgeAdmin.BridgeAlreadyStarted _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosBridgeAdmin.BridgeAlreadyStartedHelper.write(_out, _ex0);
			}
			catch(org.omg.CosBridgeAdmin.InvalidExternalEndPoints _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // stop_bridge
			{
			try
			{
				_out = handler.createReply();
				stop_bridge();
			}
			catch(org.omg.CosBridgeAdmin.BridgeInactive _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosBridgeAdmin.BridgeInactiveHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // _get_end_point_receiver
			{
			_out = handler.createReply();
			org.omg.CosBridgeAdmin.ExternalEndpointHelper.write(_out,end_point_receiver());
				break;
			}
			case 3: // _get_end_point_sender
			{
			_out = handler.createReply();
			org.omg.CosBridgeAdmin.ExternalEndpointHelper.write(_out,end_point_sender());
				break;
			}
			case 4: // destroy
			{
				_out = handler.createReply();
				destroy();
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
