package org.omg.dds;


/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public abstract class TopicListenerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.TopicListenerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "on_inconsistent_topic", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/dds/TopicListener:1.0","IDL:omg.org/dds/Listener:1.0"};
	public org.omg.dds.TopicListener _this()
	{
		return org.omg.dds.TopicListenerHelper.narrow(_this_object());
	}
	public org.omg.dds.TopicListener _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.TopicListenerHelper.narrow(_this_object(orb));
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
			case 0: // on_inconsistent_topic
			{
				org.omg.dds.Topic _arg0=org.omg.dds.TopicHelper.read(_input);
				org.omg.dds.InconsistentTopicStatus _arg1=org.omg.dds.InconsistentTopicStatusHelper.read(_input);
				_out = handler.createReply();
				on_inconsistent_topic(_arg0,_arg1);
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
