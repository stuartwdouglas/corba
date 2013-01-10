package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySortedCollection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class EqualitySortedCollectionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.EqualitySortedCollectionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "locate_or_add_element_set_iterator", new java.lang.Integer(0));
		m_opsHash.put ( "number_of_elements", new java.lang.Integer(1));
		m_opsHash.put ( "locate_last_element", new java.lang.Integer(2));
		m_opsHash.put ( "locate_element", new java.lang.Integer(3));
		m_opsHash.put ( "retrieve_element_at", new java.lang.Integer(4));
		m_opsHash.put ( "retrieve_element_at_position", new java.lang.Integer(5));
		m_opsHash.put ( "locate_previous_different_element", new java.lang.Integer(6));
		m_opsHash.put ( "_get_element_type", new java.lang.Integer(7));
		m_opsHash.put ( "locate_previous_element", new java.lang.Integer(8));
		m_opsHash.put ( "create_ordered_iterator", new java.lang.Integer(9));
		m_opsHash.put ( "remove_element", new java.lang.Integer(10));
		m_opsHash.put ( "number_of_different_elements", new java.lang.Integer(11));
		m_opsHash.put ( "contains_element", new java.lang.Integer(12));
		m_opsHash.put ( "remove_element_at", new java.lang.Integer(13));
		m_opsHash.put ( "add_element", new java.lang.Integer(14));
		m_opsHash.put ( "locate_next_different_element", new java.lang.Integer(15));
		m_opsHash.put ( "is_empty", new java.lang.Integer(16));
		m_opsHash.put ( "retrieve_first_element", new java.lang.Integer(17));
		m_opsHash.put ( "locate_next_element", new java.lang.Integer(18));
		m_opsHash.put ( "create_iterator", new java.lang.Integer(19));
		m_opsHash.put ( "locate_or_add_element", new java.lang.Integer(20));
		m_opsHash.put ( "contains_all_from", new java.lang.Integer(21));
		m_opsHash.put ( "locate_first_element", new java.lang.Integer(22));
		m_opsHash.put ( "number_of_occurrences", new java.lang.Integer(23));
		m_opsHash.put ( "remove_last_element", new java.lang.Integer(24));
		m_opsHash.put ( "add_element_set_iterator", new java.lang.Integer(25));
		m_opsHash.put ( "remove_first_element", new java.lang.Integer(26));
		m_opsHash.put ( "remove_all", new java.lang.Integer(27));
		m_opsHash.put ( "destroy", new java.lang.Integer(28));
		m_opsHash.put ( "remove_element_at_position", new java.lang.Integer(29));
		m_opsHash.put ( "retrieve_last_element", new java.lang.Integer(30));
		m_opsHash.put ( "add_all_from", new java.lang.Integer(31));
		m_opsHash.put ( "replace_element_at", new java.lang.Integer(32));
		m_opsHash.put ( "all_elements_do", new java.lang.Integer(33));
		m_opsHash.put ( "remove_all_occurrences", new java.lang.Integer(34));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/EqualitySortedCollection:1.0","IDL:omg.org/CosCollection/Collection:1.0","IDL:omg.org/CosCollection/OrderedCollection:1.0","IDL:omg.org/CosCollection/SortedCollection:1.0","IDL:omg.org/CosCollection/EqualityCollection:1.0"};
	public org.omg.CosCollection.EqualitySortedCollection _this()
	{
		return org.omg.CosCollection.EqualitySortedCollectionHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.EqualitySortedCollection _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.EqualitySortedCollectionHelper.narrow(_this_object(orb));
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
			case 0: // locate_or_add_element_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_or_add_element_set_iterator(_arg0,_arg1));
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
			case 1: // number_of_elements
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_elements());
				break;
			}
			case 2: // locate_last_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_last_element(_arg0,_arg1));
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
			case 3: // locate_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_element(_arg0,_arg1));
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
			case 4: // retrieve_element_at
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
			case 5: // retrieve_element_at_position
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
			case 6: // locate_previous_different_element
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_previous_different_element(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // _get_element_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(element_type());
				break;
			}
			case 8: // locate_previous_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_previous_element(_arg0,_arg1));
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
			case 9: // create_ordered_iterator
			{
				boolean _arg0=_input.read_boolean();
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.OrderedIteratorHelper.write(_out,create_ordered_iterator(_arg0,_arg1));
				break;
			}
			case 10: // remove_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(remove_element(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // number_of_different_elements
			{
				_out = handler.createReply();
				_out.write_ulong(number_of_different_elements());
				break;
			}
			case 12: // contains_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(contains_element(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // remove_element_at
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
			case 14: // add_element
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
			case 15: // locate_next_different_element
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_next_different_element(_arg0));
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
			case 16: // is_empty
			{
				_out = handler.createReply();
				_out.write_boolean(is_empty());
				break;
			}
			case 17: // retrieve_first_element
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
			case 18: // locate_next_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_next_element(_arg0,_arg1));
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
			case 19: // create_iterator
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,create_iterator(_arg0));
				break;
			}
			case 20: // locate_or_add_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(locate_or_add_element(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // contains_all_from
			{
			try
			{
				org.omg.CosCollection.Collection _arg0=org.omg.CosCollection.CollectionHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(contains_all_from(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // locate_first_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				org.omg.CosCollection.Iterator _arg1=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(locate_first_element(_arg0,_arg1));
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
			case 23: // number_of_occurrences
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_ulong(number_of_occurrences(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // remove_last_element
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
			case 25: // add_element_set_iterator
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
			case 26: // remove_first_element
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
			case 27: // remove_all
			{
				_out = handler.createReply();
				_out.write_ulong(remove_all());
				break;
			}
			case 28: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 29: // remove_element_at_position
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
			case 30: // retrieve_last_element
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
			case 31: // add_all_from
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
			case 32: // replace_element_at
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
			case 33: // all_elements_do
			{
				org.omg.CosCollection.Command _arg0=org.omg.CosCollection.CommandHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(all_elements_do(_arg0));
				break;
			}
			case 34: // remove_all_occurrences
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_ulong(remove_all_occurrences(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
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
