package org.omg.CosCollection;


/**
 * Generated from IDL interface "Heap".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public abstract class HeapPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.HeapOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "remove_all", new java.lang.Integer(0));
		m_opsHash.put ( "add_element", new java.lang.Integer(1));
		m_opsHash.put ( "remove_element_at", new java.lang.Integer(2));
		m_opsHash.put ( "replace_element_at", new java.lang.Integer(3));
		m_opsHash.put ( "number_of_elements", new java.lang.Integer(4));
		m_opsHash.put ( "create_iterator", new java.lang.Integer(5));
		m_opsHash.put ( "_get_element_type", new java.lang.Integer(6));
		m_opsHash.put ( "retrieve_element_at", new java.lang.Integer(7));
		m_opsHash.put ( "add_element_set_iterator", new java.lang.Integer(8));
		m_opsHash.put ( "is_empty", new java.lang.Integer(9));
		m_opsHash.put ( "destroy", new java.lang.Integer(10));
		m_opsHash.put ( "add_all_from", new java.lang.Integer(11));
		m_opsHash.put ( "all_elements_do", new java.lang.Integer(12));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/Heap:1.0","IDL:omg.org/CosCollection/Collection:1.0"};
	public org.omg.CosCollection.Heap _this()
	{
		return org.omg.CosCollection.HeapHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Heap _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.HeapHelper.narrow(_this_object(orb));
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
			case 0: // remove_all
			{
				_out = handler.createReply();
				_out.write_ulong(remove_all());
				break;
			}
			case 1: // add_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // remove_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				remove_element_at(_arg0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 3: // replace_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				replace_element_at(_arg0,_arg1);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 4: // number_of_elements
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_elements());
				break;
			}
			case 5: // create_iterator
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,create_iterator(_arg0));
				break;
			}
			case 6: // _get_element_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(element_type());
				break;
			}
			case 7: // retrieve_element_at
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_at(_arg0,_arg1));
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 8: // add_element_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(add_element_set_iterator(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // is_empty
			{
				_out = handler.createReply();
				_out.write_boolean(is_empty());
				break;
			}
			case 10: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 11: // add_all_from
			{
			try
			{
				org.omg.CosCollection.Collection _arg0=org.omg.CosCollection.CollectionHelper.read(_input);
				_out = handler.createReply();
				add_all_from(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // all_elements_do
			{
				org.omg.CosCollection.Command _arg0=org.omg.CosCollection.CommandHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(all_elements_do(_arg0));
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
