package org.omg.CosCollection;


/**
 * Generated from IDL interface "Collection".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public class _CollectionStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosCollection.Collection
{
	private String[] ids = {"IDL:omg.org/CosCollection/Collection:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosCollection.CollectionOperations.class;
	public int remove_all()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "remove_all", true);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_all", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.remove_all();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean add_element(org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "add_element", true);
				_os.write_any(element);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/ElementInvalid:1.0"))
					{
						throw org.omg.CosCollection.ElementInvalidHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_element", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.add_element(element);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void remove_element_at(org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "remove_element_at", true);
				org.omg.CosCollection.IteratorHelper.write(_os,where);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInvalid:1.0"))
					{
						throw org.omg.CosCollection.IteratorInvalidHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInBetween:1.0"))
					{
						throw org.omg.CosCollection.IteratorInBetweenHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_element_at", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			try
			{
				_localServant.remove_element_at(where);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void replace_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.Any element) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "replace_element_at", true);
				org.omg.CosCollection.IteratorHelper.write(_os,where);
				_os.write_any(element);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/ElementInvalid:1.0"))
					{
						throw org.omg.CosCollection.ElementInvalidHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInvalid:1.0"))
					{
						throw org.omg.CosCollection.IteratorInvalidHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInBetween:1.0"))
					{
						throw org.omg.CosCollection.IteratorInBetweenHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "replace_element_at", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			try
			{
				_localServant.replace_element_at(where,element);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int number_of_elements()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "number_of_elements", true);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "number_of_elements", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.number_of_elements();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosCollection.Iterator create_iterator(boolean read_only)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_iterator", true);
				_os.write_boolean(read_only);
				_is = _invoke(_os);
				org.omg.CosCollection.Iterator _result = org.omg.CosCollection.IteratorHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_iterator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			org.omg.CosCollection.Iterator _result;
			try
			{
				_result = _localServant.create_iterator(read_only);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.TypeCode element_type()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request("_get_element_type",true);
				_is = _invoke(_os);
				return _is.read_TypeCode();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_element_type", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			org.omg.CORBA.TypeCode _result;
		try
		{
			_result = _localServant.element_type();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public boolean retrieve_element_at(org.omg.CosCollection.Iterator where, org.omg.CORBA.AnyHolder element) throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "retrieve_element_at", true);
				org.omg.CosCollection.IteratorHelper.write(_os,where);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				element.value = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInvalid:1.0"))
					{
						throw org.omg.CosCollection.IteratorInvalidHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInBetween:1.0"))
					{
						throw org.omg.CosCollection.IteratorInBetweenHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieve_element_at", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.retrieve_element_at(where,element);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean add_element_set_iterator(org.omg.CORBA.Any element, org.omg.CosCollection.Iterator where) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "add_element_set_iterator", true);
				_os.write_any(element);
				org.omg.CosCollection.IteratorHelper.write(_os,where);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/ElementInvalid:1.0"))
					{
						throw org.omg.CosCollection.ElementInvalidHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosCollection/IteratorInvalid:1.0"))
					{
						throw org.omg.CosCollection.IteratorInvalidHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_element_set_iterator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.add_element_set_iterator(element,where);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean is_empty()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "is_empty", true);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "is_empty", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.is_empty();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void destroy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "destroy", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			try
			{
				_localServant.destroy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void add_all_from(org.omg.CosCollection.Collection collector) throws org.omg.CosCollection.ElementInvalid
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "add_all_from", true);
				org.omg.CosCollection.CollectionHelper.write(_os,collector);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/ElementInvalid:1.0"))
					{
						throw org.omg.CosCollection.ElementInvalidHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_all_from", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			try
			{
				_localServant.add_all_from(collector);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean all_elements_do(org.omg.CosCollection.Command what)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "all_elements_do", true);
				org.omg.CosCollection.CommandHelper.write(_os,what);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "all_elements_do", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionOperations _localServant = (CollectionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.all_elements_do(what);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
