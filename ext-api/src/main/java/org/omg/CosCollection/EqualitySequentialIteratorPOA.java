package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySequentialIterator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class EqualitySequentialIteratorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.EqualitySequentialIteratorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "clone", new java.lang.Integer(0));
		m_opsHash.put ( "add_n_elements_set_iterator", new java.lang.Integer(1));
		m_opsHash.put ( "add_n_elements_as_next_set_iterator", new java.lang.Integer(2));
		m_opsHash.put ( "replace_element_set_to_previous", new java.lang.Integer(3));
		m_opsHash.put ( "is_valid", new java.lang.Integer(4));
		m_opsHash.put ( "set_to_first_element_with_value", new java.lang.Integer(5));
		m_opsHash.put ( "add_element_as_previous_set_iterator", new java.lang.Integer(6));
		m_opsHash.put ( "remove_next_n_elements", new java.lang.Integer(7));
		m_opsHash.put ( "set_to_next_nth_element", new java.lang.Integer(8));
		m_opsHash.put ( "replace_element", new java.lang.Integer(9));
		m_opsHash.put ( "add_n_elements_as_previous_set_iterator", new java.lang.Integer(10));
		m_opsHash.put ( "is_for_same", new java.lang.Integer(11));
		m_opsHash.put ( "is_reverse", new java.lang.Integer(12));
		m_opsHash.put ( "assign", new java.lang.Integer(13));
		m_opsHash.put ( "position", new java.lang.Integer(14));
		m_opsHash.put ( "retrieve_element", new java.lang.Integer(15));
		m_opsHash.put ( "set_to_first_element", new java.lang.Integer(16));
		m_opsHash.put ( "set_to_last_element_with_value", new java.lang.Integer(17));
		m_opsHash.put ( "retrieve_next_n_elements", new java.lang.Integer(18));
		m_opsHash.put ( "set_to_previous_element", new java.lang.Integer(19));
		m_opsHash.put ( "replace_previous_n_elements", new java.lang.Integer(20));
		m_opsHash.put ( "is_last", new java.lang.Integer(21));
		m_opsHash.put ( "set_to_next_element", new java.lang.Integer(22));
		m_opsHash.put ( "set_to_nth_previous_element", new java.lang.Integer(23));
		m_opsHash.put ( "destroy", new java.lang.Integer(24));
		m_opsHash.put ( "add_element_as_next_set_iterator", new java.lang.Integer(25));
		m_opsHash.put ( "set_to_last_element", new java.lang.Integer(26));
		m_opsHash.put ( "not_equal_retrieve_element_set_to_next", new java.lang.Integer(27));
		m_opsHash.put ( "set_to_previous_element_with_value", new java.lang.Integer(28));
		m_opsHash.put ( "not_equal_replace_element_set_to_previous", new java.lang.Integer(29));
		m_opsHash.put ( "remove_element_set_to_previous", new java.lang.Integer(30));
		m_opsHash.put ( "remove_element", new java.lang.Integer(31));
		m_opsHash.put ( "not_equal_remove_element_set_to_next", new java.lang.Integer(32));
		m_opsHash.put ( "is_equal", new java.lang.Integer(33));
		m_opsHash.put ( "retrieve_element_set_to_previous", new java.lang.Integer(34));
		m_opsHash.put ( "invalidate", new java.lang.Integer(35));
		m_opsHash.put ( "set_to_next_element_with_value", new java.lang.Integer(36));
		m_opsHash.put ( "remove_element_set_to_next", new java.lang.Integer(37));
		m_opsHash.put ( "not_equal_remove_element_set_to_previous", new java.lang.Integer(38));
		m_opsHash.put ( "remove_previous_n_elements", new java.lang.Integer(39));
		m_opsHash.put ( "retrieve_previous_n_elements", new java.lang.Integer(40));
		m_opsHash.put ( "not_equal_replace_element_set_to_next", new java.lang.Integer(41));
		m_opsHash.put ( "replace_element_set_to_next", new java.lang.Integer(42));
		m_opsHash.put ( "is_for", new java.lang.Integer(43));
		m_opsHash.put ( "is_first", new java.lang.Integer(44));
		m_opsHash.put ( "set_to_element_with_value", new java.lang.Integer(45));
		m_opsHash.put ( "add_element_set_iterator", new java.lang.Integer(46));
		m_opsHash.put ( "replace_next_n_elements", new java.lang.Integer(47));
		m_opsHash.put ( "set_to_next_element_with_different_value", new java.lang.Integer(48));
		m_opsHash.put ( "not_equal_retrieve_element_set_to_previous", new java.lang.Integer(49));
		m_opsHash.put ( "retrieve_element_set_to_next", new java.lang.Integer(50));
		m_opsHash.put ( "is_const", new java.lang.Integer(51));
		m_opsHash.put ( "set_to_position", new java.lang.Integer(52));
		m_opsHash.put ( "is_in_between", new java.lang.Integer(53));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/EqualitySequentialIterator:1.0","IDL:omg.org/CosCollection/SequentialIterator:1.0","IDL:omg.org/CosCollection/EqualityIterator:1.0","IDL:omg.org/CosCollection/Iterator:1.0","IDL:omg.org/CosCollection/OrderedIterator:1.0"};
	public org.omg.CosCollection.EqualitySequentialIterator _this()
	{
		return org.omg.CosCollection.EqualitySequentialIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.EqualitySequentialIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.EqualitySequentialIteratorHelper.narrow(_this_object(orb));
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
			case 0: // clone
			{
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,_clone());
				break;
			}
			case 1: // add_n_elements_set_iterator
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(add_n_elements_set_iterator(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // add_n_elements_as_next_set_iterator
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				_out = handler.createReply();
				add_n_elements_as_next_set_iterator(_arg0);
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
			case 3: // replace_element_set_to_previous
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(replace_element_set_to_previous(_arg0));
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
			case 4: // is_valid
			{
				_out = handler.createReply();
				_out.write_boolean(is_valid());
				break;
			}
			case 5: // set_to_first_element_with_value
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(set_to_first_element_with_value(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // add_element_as_previous_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element_as_previous_set_iterator(_arg0));
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
			case 7: // remove_next_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(remove_next_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
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
			case 8: // set_to_next_nth_element
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				_out.write_boolean(set_to_next_nth_element(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // replace_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				replace_element(_arg0);
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
			case 10: // add_n_elements_as_previous_set_iterator
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				_out = handler.createReply();
				add_n_elements_as_previous_set_iterator(_arg0);
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
			case 11: // is_for_same
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_for_same(_arg0));
				break;
			}
			case 12: // is_reverse
			{
				_out = handler.createReply();
				_out.write_boolean(is_reverse());
				break;
			}
			case 13: // assign
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				assign(_arg0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // position
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(position());
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // retrieve_element
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element(_arg0));
				_out.write_any(_arg0.value);
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
			case 16: // set_to_first_element
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_first_element());
				break;
			}
			case 17: // set_to_last_element_with_value
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(set_to_last_element_with_value(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // retrieve_next_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CosCollection.AnySequenceHolder _arg1= new org.omg.CosCollection.AnySequenceHolder();
				org.omg.CORBA.BooleanHolder _arg2= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_next_n_elements(_arg0,_arg1,_arg2));
				org.omg.CosCollection.AnySequenceHelper.write(_out,_arg1.value);
				_out.write_boolean(_arg2.value);
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
			case 19: // set_to_previous_element
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_previous_element());
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // replace_previous_n_elements
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(replace_previous_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
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
			case 21: // is_last
			{
				_out = handler.createReply();
				_out.write_boolean(is_last());
				break;
			}
			case 22: // set_to_next_element
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_next_element());
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // set_to_nth_previous_element
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				_out.write_boolean(set_to_nth_previous_element(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 25: // add_element_as_next_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element_as_next_set_iterator(_arg0));
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
			case 26: // set_to_last_element
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_last_element());
				break;
			}
			case 27: // not_equal_retrieve_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(not_equal_retrieve_element_set_to_next(_arg0,_arg1));
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
			case 28: // set_to_previous_element_with_value
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(set_to_previous_element_with_value(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // not_equal_replace_element_set_to_previous
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(not_equal_replace_element_set_to_previous(_arg0,_arg1));
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
			case 30: // remove_element_set_to_previous
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(remove_element_set_to_previous());
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
			case 31: // remove_element
			{
			try
			{
				_out = handler.createReply();
				remove_element();
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
			case 32: // not_equal_remove_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(not_equal_remove_element_set_to_next(_arg0));
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
			case 33: // is_equal
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_equal(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // retrieve_element_set_to_previous
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				org.omg.CORBA.BooleanHolder _arg1= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_set_to_previous(_arg0,_arg1));
				_out.write_any(_arg0.value);
				_out.write_boolean(_arg1.value);
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
			case 35: // invalidate
			{
				_out = handler.createReply();
				invalidate();
				break;
			}
			case 36: // set_to_next_element_with_value
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(set_to_next_element_with_value(_arg0));
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
			case 37: // remove_element_set_to_next
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(remove_element_set_to_next());
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
			case 38: // not_equal_remove_element_set_to_previous
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(not_equal_remove_element_set_to_previous(_arg0));
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
			case 39: // remove_previous_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(remove_previous_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
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
			case 40: // retrieve_previous_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CosCollection.AnySequenceHolder _arg1= new org.omg.CosCollection.AnySequenceHolder();
				org.omg.CORBA.BooleanHolder _arg2= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_previous_n_elements(_arg0,_arg1,_arg2));
				org.omg.CosCollection.AnySequenceHelper.write(_out,_arg1.value);
				_out.write_boolean(_arg2.value);
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
			case 41: // not_equal_replace_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(not_equal_replace_element_set_to_next(_arg0,_arg1));
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
			case 42: // replace_element_set_to_next
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(replace_element_set_to_next(_arg0));
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
			case 43: // is_for
			{
				org.omg.CosCollection.Collection _arg0=org.omg.CosCollection.CollectionHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_for(_arg0));
				break;
			}
			case 44: // is_first
			{
				_out = handler.createReply();
				_out.write_boolean(is_first());
				break;
			}
			case 45: // set_to_element_with_value
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(set_to_element_with_value(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // add_element_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element_set_iterator(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // replace_next_n_elements
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(replace_next_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
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
			case 48: // set_to_next_element_with_different_value
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_next_element_with_different_value());
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
			case 49: // not_equal_retrieve_element_set_to_previous
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(not_equal_retrieve_element_set_to_previous(_arg0,_arg1));
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
			case 50: // retrieve_element_set_to_next
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				org.omg.CORBA.BooleanHolder _arg1= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_set_to_next(_arg0,_arg1));
				_out.write_any(_arg0.value);
				_out.write_boolean(_arg1.value);
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
			case 51: // is_const
			{
				_out = handler.createReply();
				_out.write_boolean(is_const());
				break;
			}
			case 52: // set_to_position
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				set_to_position(_arg0);
			}
			catch(org.omg.CosCollection.PositionInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.PositionInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // is_in_between
			{
				_out = handler.createReply();
				_out.write_boolean(is_in_between());
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
