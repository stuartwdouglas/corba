package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertiesIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public abstract class PropertiesIteratorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosPropertyService.PropertiesIteratorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "next_n", new java.lang.Integer(0));
		m_opsHash.put ( "next_one", new java.lang.Integer(1));
		m_opsHash.put ( "reset", new java.lang.Integer(2));
		m_opsHash.put ( "destroy", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertiesIterator:1.0"};
	public org.omg.CosPropertyService.PropertiesIterator _this()
	{
		return org.omg.CosPropertyService.PropertiesIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosPropertyService.PropertiesIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosPropertyService.PropertiesIteratorHelper.narrow(_this_object(orb));
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
			case 0: // next_n
			{
				int _arg0=_input.read_ulong();
				org.omg.CosPropertyService.PropertiesHolder _arg1= new org.omg.CosPropertyService.PropertiesHolder();
				_out = handler.createReply();
				_out.write_boolean(next_n(_arg0,_arg1));
				org.omg.CosPropertyService.PropertiesHelper.write(_out,_arg1.value);
				break;
			}
			case 1: // next_one
			{
				org.omg.CosPropertyService.PropertyHolder _arg0= new org.omg.CosPropertyService.PropertyHolder();
				_out = handler.createReply();
				_out.write_boolean(next_one(_arg0));
				org.omg.CosPropertyService.PropertyHelper.write(_out,_arg0.value);
				break;
			}
			case 2: // reset
			{
				_out = handler.createReply();
				reset();
				break;
			}
			case 3: // destroy
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
