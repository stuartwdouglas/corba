package org.omg.CosCollection;


/**
 * Generated from IDL interface "CSequence".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class CSequencePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.CSequenceOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "add_element_as_last", new java.lang.Integer(0));
		m_opsHash.put ( "reverse", new java.lang.Integer(1));
		m_opsHash.put ( "number_of_elements", new java.lang.Integer(2));
		m_opsHash.put ( "retrieve_element_at", new java.lang.Integer(3));
		m_opsHash.put ( "retrieve_element_at_position", new java.lang.Integer(4));
		m_opsHash.put ( "add_element_as_first", new java.lang.Integer(5));
		m_opsHash.put ( "add_element_at_position", new java.lang.Integer(6));
		m_opsHash.put ( "add_element_as_next", new java.lang.Integer(7));
		m_opsHash.put ( "replace_element_at_position", new java.lang.Integer(8));
		m_opsHash.put ( "_get_element_type", new java.lang.Integer(9));
		m_opsHash.put ( "replace_last_element", new java.lang.Integer(10));
		m_opsHash.put ( "create_ordered_iterator", new java.lang.Integer(11));
		m_opsHash.put ( "remove_element_at", new java.lang.Integer(12));
		m_opsHash.put ( "add_element", new java.lang.Integer(13));
		m_opsHash.put ( "sort", new java.lang.Integer(14));
		m_opsHash.put ( "add_element_at_position_set_iterator", new java.lang.Integer(15));
		m_opsHash.put ( "is_empty", new java.lang.Integer(16));
		m_opsHash.put ( "create_iterator", new java.lang.Integer(17));
		m_opsHash.put ( "retrieve_first_element", new java.lang.Integer(18));
		m_opsHash.put ( "compare", new java.lang.Integer(19));
		m_opsHash.put ( "replace_first_element", new java.lang.Integer(20));
		m_opsHash.put ( "add_element_as_last_set_iterator", new java.lang.Integer(21));
		m_opsHash.put ( "remove_last_element", new java.lang.Integer(22));
		m_opsHash.put ( "add_element_set_iterator", new java.lang.Integer(23));
		m_opsHash.put ( "add_element_as_first_set_iterator", new java.lang.Integer(24));
		m_opsHash.put ( "remove_first_element", new java.lang.Integer(25));
		m_opsHash.put ( "remove_all", new java.lang.Integer(26));
		m_opsHash.put ( "add_element_as_previous", new java.lang.Integer(27));
		m_opsHash.put ( "destroy", new java.lang.Integer(28));
		m_opsHash.put ( "add_all_from", new java.lang.Integer(29));
		m_opsHash.put ( "remove_element_at_position", new java.lang.Integer(30));
		m_opsHash.put ( "retrieve_last_element", new java.lang.Integer(31));
		m_opsHash.put ( "all_elements_do", new java.lang.Integer(32));
		m_opsHash.put ( "replace_element_at", new java.lang.Integer(33));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/CSequence:1.0","IDL:omg.org/CosCollection/SequentialCollection:1.0","IDL:omg.org/CosCollection/Collection:1.0","IDL:omg.org/CosCollection/OrderedCollection:1.0"};
	public org.omg.CosCollection.CSequence _this()
	{
		return org.omg.CosCollection.CSequenceHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.CSequence _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.CSequenceHelper.narrow(_this_object(orb));
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
			case 0: // add_element_as_last
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				add_element_as_last(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // reverse
			{
				_out = handler.createReply();
				reverse();
				break;
			}
			case 2: // number_of_elements
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_elements());
				break;
			}
			case 3: // retrieve_element_at
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
			case 4: // retrieve_element_at_position
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_at_position(_arg0,_arg1));
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // add_element_as_first
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				add_element_as_first(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // add_element_at_position
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				add_element_at_position(_arg0,_arg1);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 7: // add_element_as_next
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				add_element_as_next(_arg0,_arg1);
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
			case 8: // replace_element_at_position
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				replace_element_at_position(_arg0,_arg1);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // _get_element_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(element_type());
				break;
			}
			case 10: // replace_last_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				replace_last_element(_arg0);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 11: // create_ordered_iterator
			{
				boolean _arg0=_input.read_boolean();
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.OrderedIteratorHelper.write(_out,create_ordered_iterator(_arg0,_arg1));
				break;
			}
			case 12: // remove_element_at
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
			case 13: // add_element
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
			case 14: // sort
			{
				org.omg.CosCollection.Comparator _arg0=org.omg.CosCollection.ComparatorHelper.read(_input);
				_out = handler.createReply();
				sort(_arg0);
				break;
			}
			case 15: // add_element_at_position_set_iterator
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.Any _arg1=_input.read_any();
				org.omg.CosCollection.Iterator _arg2=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				add_element_at_position_set_iterator(_arg0,_arg1,_arg2);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex2);
			}
				break;
			}
			case 16: // is_empty
			{
				_out = handler.createReply();
				_out.write_boolean(is_empty());
				break;
			}
			case 17: // create_iterator
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,create_iterator(_arg0));
				break;
			}
			case 18: // retrieve_first_element
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_first_element(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // compare
			{
				org.omg.CosCollection.CSequence _arg0=org.omg.CosCollection.CSequenceHelper.read(_input);
				org.omg.CosCollection.Comparator _arg1=org.omg.CosCollection.ComparatorHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(compare(_arg0,_arg1));
				break;
			}
			case 20: // replace_first_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				replace_first_element(_arg0);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex1);
			}
				break;
			}
			case 21: // add_element_as_last_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				add_element_as_last_set_iterator(_arg0,_arg1);
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
			case 22: // remove_last_element
			{
			try
			{
				_out = handler.createReply();
				remove_last_element();
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // add_element_set_iterator
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
			case 24: // add_element_as_first_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				add_element_as_first_set_iterator(_arg0,_arg1);
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
			case 25: // remove_first_element
			{
			try
			{
				_out = handler.createReply();
				remove_first_element();
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // remove_all
			{
				_out = handler.createReply();
				_out.write_ulong(remove_all());
				break;
			}
			case 27: // add_element_as_previous
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				add_element_as_previous(_arg0,_arg1);
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
			case 28: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 29: // add_all_from
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
			case 30: // remove_element_at_position
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				remove_element_at_position(_arg0);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // retrieve_last_element
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_last_element(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // all_elements_do
			{
				org.omg.CosCollection.Command _arg0=org.omg.CosCollection.CommandHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(all_elements_do(_arg0));
				break;
			}
			case 33: // replace_element_at
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
