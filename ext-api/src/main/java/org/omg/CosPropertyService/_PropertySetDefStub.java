package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public class _PropertySetDefStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosPropertyService.PropertySetDef
{
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetDef:1.0","IDL:omg.org/CosPropertyService/PropertySet:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosPropertyService.PropertySetDefOperations.class;
	public void define_property_with_mode(java.lang.String property_name, org.omg.CORBA.Any property_value, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "define_property_with_mode", true);
				_os.write_string(property_name);
				_os.write_any(property_value);
				org.omg.CosPropertyService.PropertyModeTypeHelper.write(_os,property_mode);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedMode:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedModeHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/ConflictingProperty:1.0"))
					{
						throw org.omg.CosPropertyService.ConflictingPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedProperty:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedTypeCode:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedTypeCodeHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/ReadOnlyProperty:1.0"))
					{
						throw org.omg.CosPropertyService.ReadOnlyPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "define_property_with_mode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.define_property_with_mode(property_name,property_value,property_mode);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.Any get_property_value(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_property_value", true);
				_os.write_string(property_name);
				_is = _invoke(_os);
				org.omg.CORBA.Any _result = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/PropertyNotFound:1.0"))
					{
						throw org.omg.CosPropertyService.PropertyNotFoundHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_property_value", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			org.omg.CORBA.Any _result;
			try
			{
				_result = _localServant.get_property_value(property_name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_property_modes(org.omg.CosPropertyService.PropertyMode[] property_modes) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_property_modes", true);
				org.omg.CosPropertyService.PropertyModesHelper.write(_os,property_modes);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/MultipleExceptions:1.0"))
					{
						throw org.omg.CosPropertyService.MultipleExceptionsHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_property_modes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.set_property_modes(property_modes);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void delete_property(java.lang.String property_name) throws org.omg.CosPropertyService.FixedProperty,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "delete_property", true);
				_os.write_string(property_name);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/FixedProperty:1.0"))
					{
						throw org.omg.CosPropertyService.FixedPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/PropertyNotFound:1.0"))
					{
						throw org.omg.CosPropertyService.PropertyNotFoundHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delete_property", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.delete_property(property_name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean get_properties(java.lang.String[] property_names, org.omg.CosPropertyService.PropertiesHolder nproperties)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_properties", true);
				org.omg.CosPropertyService.PropertyNamesHelper.write(_os,property_names);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				nproperties.value = org.omg.CosPropertyService.PropertiesHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.get_properties(property_names,nproperties);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean get_property_modes(java.lang.String[] property_names, org.omg.CosPropertyService.PropertyModesHolder property_modes)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_property_modes", true);
				org.omg.CosPropertyService.PropertyNamesHelper.write(_os,property_names);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				property_modes.value = org.omg.CosPropertyService.PropertyModesHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_property_modes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.get_property_modes(property_names,property_modes);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosPropertyService.PropertyModeType get_property_mode(java.lang.String property_name) throws org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_property_mode", true);
				_os.write_string(property_name);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertyModeType _result = org.omg.CosPropertyService.PropertyModeTypeHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/PropertyNotFound:1.0"))
					{
						throw org.omg.CosPropertyService.PropertyNotFoundHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_property_mode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			org.omg.CosPropertyService.PropertyModeType _result;
			try
			{
				_result = _localServant.get_property_mode(property_name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_property_mode(java.lang.String property_name, org.omg.CosPropertyService.PropertyModeType property_mode) throws org.omg.CosPropertyService.UnsupportedMode,org.omg.CosPropertyService.PropertyNotFound,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_property_mode", true);
				_os.write_string(property_name);
				org.omg.CosPropertyService.PropertyModeTypeHelper.write(_os,property_mode);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedMode:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedModeHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/PropertyNotFound:1.0"))
					{
						throw org.omg.CosPropertyService.PropertyNotFoundHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_property_mode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.set_property_mode(property_name,property_mode);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void delete_properties(java.lang.String[] property_names) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "delete_properties", true);
				org.omg.CosPropertyService.PropertyNamesHelper.write(_os,property_names);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/MultipleExceptions:1.0"))
					{
						throw org.omg.CosPropertyService.MultipleExceptionsHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delete_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.delete_properties(property_names);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void get_all_property_names(int how_many, org.omg.CosPropertyService.PropertyNamesHolder property_names, org.omg.CosPropertyService.PropertyNamesIteratorHolder rest)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_all_property_names", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				property_names.value = org.omg.CosPropertyService.PropertyNamesHelper.read(_is);
				rest.value = org.omg.CosPropertyService.PropertyNamesIteratorHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_property_names", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.get_all_property_names(how_many,property_names,rest);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void get_allowed_property_types(org.omg.CosPropertyService.PropertyTypesHolder property_types)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_allowed_property_types", true);
				_is = _invoke(_os);
				property_types.value = org.omg.CosPropertyService.PropertyTypesHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_allowed_property_types", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.get_allowed_property_types(property_types);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean delete_all_properties()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "delete_all_properties", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delete_all_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.delete_all_properties();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void define_property(java.lang.String property_name, org.omg.CORBA.Any property_value) throws org.omg.CosPropertyService.ConflictingProperty,org.omg.CosPropertyService.UnsupportedProperty,org.omg.CosPropertyService.UnsupportedTypeCode,org.omg.CosPropertyService.ReadOnlyProperty,org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "define_property", true);
				_os.write_string(property_name);
				_os.write_any(property_value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/ConflictingProperty:1.0"))
					{
						throw org.omg.CosPropertyService.ConflictingPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedProperty:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/UnsupportedTypeCode:1.0"))
					{
						throw org.omg.CosPropertyService.UnsupportedTypeCodeHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/ReadOnlyProperty:1.0"))
					{
						throw org.omg.CosPropertyService.ReadOnlyPropertyHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "define_property", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.define_property(property_name,property_value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void define_properties_with_modes(org.omg.CosPropertyService.PropertyDef[] property_defs) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "define_properties_with_modes", true);
				org.omg.CosPropertyService.PropertyDefsHelper.write(_os,property_defs);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/MultipleExceptions:1.0"))
					{
						throw org.omg.CosPropertyService.MultipleExceptionsHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "define_properties_with_modes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.define_properties_with_modes(property_defs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int get_number_of_properties()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_number_of_properties", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_number_of_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.get_number_of_properties();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void get_all_properties(int how_many, org.omg.CosPropertyService.PropertiesHolder nproperties, org.omg.CosPropertyService.PropertiesIteratorHolder rest)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_all_properties", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nproperties.value = org.omg.CosPropertyService.PropertiesHelper.read(_is);
				rest.value = org.omg.CosPropertyService.PropertiesIteratorHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.get_all_properties(how_many,nproperties,rest);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean is_property_defined(java.lang.String property_name) throws org.omg.CosPropertyService.InvalidPropertyName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "is_property_defined", true);
				_os.write_string(property_name);
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
					if( _id.equals("IDL:omg.org/CosPropertyService/InvalidPropertyName:1.0"))
					{
						throw org.omg.CosPropertyService.InvalidPropertyNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "is_property_defined", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.is_property_defined(property_name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void define_properties(org.omg.CosPropertyService.Property[] nproperties) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "define_properties", true);
				org.omg.CosPropertyService.PropertiesHelper.write(_os,nproperties);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/MultipleExceptions:1.0"))
					{
						throw org.omg.CosPropertyService.MultipleExceptionsHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "define_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.define_properties(nproperties);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void get_allowed_properties(org.omg.CosPropertyService.PropertyDefsHolder property_defs)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_allowed_properties", true);
				_is = _invoke(_os);
				property_defs.value = org.omg.CosPropertyService.PropertyDefsHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_allowed_properties", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefOperations _localServant = (PropertySetDefOperations)_so.servant;
			try
			{
				_localServant.get_allowed_properties(property_defs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
