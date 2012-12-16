package org.omg.CORBA;


/**
 * Generated from IDL interface "Container".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public class _ContainerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CORBA.Container
{
	private String[] ids = {"IDL:omg.org/CORBA/Container:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CORBA.ContainerOperations.class;
	public org.omg.CORBA.DefinitionKind def_kind()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request("_get_def_kind",true);
				_is = _invoke(_os);
				return org.omg.CORBA.DefinitionKindHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_kind", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.DefinitionKind _result;
		try
		{
			_result = _localServant.def_kind();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CORBA.EnumDef create_enum(java.lang.String id, java.lang.String name, java.lang.String version, java.lang.String[] members)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_enum", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.EnumMemberSeqHelper.write(_os,members);
				_is = _invoke(_os);
				org.omg.CORBA.EnumDef _result = org.omg.CORBA.EnumDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_enum", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.EnumDef _result;
			try
			{
				_result = _localServant.create_enum(id,name,version,members);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.ValueBoxDef create_value_box(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type_def)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_value_box", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.IDLTypeHelper.write(_os,original_type_def);
				_is = _invoke(_os);
				org.omg.CORBA.ValueBoxDef _result = org.omg.CORBA.ValueBoxDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_value_box", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ValueBoxDef _result;
			try
			{
				_result = _localServant.create_value_box(id,name,version,original_type_def);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.InterfaceDef create_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.InterfaceDef[] base_interfaces, boolean is_abstract)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_interface", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.InterfaceDefSeqHelper.write(_os,base_interfaces);
				_os.write_boolean(is_abstract);
				_is = _invoke(_os);
				org.omg.CORBA.InterfaceDef _result = org.omg.CORBA.InterfaceDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_interface", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.InterfaceDef _result;
			try
			{
				_result = _localServant.create_interface(id,name,version,base_interfaces,is_abstract);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.NativeDef create_native(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_native", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				_is = _invoke(_os);
				org.omg.CORBA.NativeDef _result = org.omg.CORBA.NativeDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_native", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.NativeDef _result;
			try
			{
				_result = _localServant.create_native(id,name,version);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Contained lookup(java.lang.String search_name)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "lookup", true);
				_os.write_string(search_name);
				_is = _invoke(_os);
				org.omg.CORBA.Contained _result = org.omg.CORBA.ContainedHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "lookup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.Contained _result;
			try
			{
				_result = _localServant.lookup(search_name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Contained[] contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "contents", true);
				org.omg.CORBA.DefinitionKindHelper.write(_os,limit_type);
				_os.write_boolean(exclude_inherited);
				_is = _invoke(_os);
				org.omg.CORBA.Contained[] _result = org.omg.CORBA.ContainedSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "contents", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.Contained[] _result;
			try
			{
				_result = _localServant.contents(limit_type,exclude_inherited);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.ValueDef create_value(java.lang.String id, java.lang.String name, java.lang.String version, boolean is_custom, boolean is_abstract, org.omg.CORBA.ValueDef base_value, boolean is_truncatable, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_value", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				_os.write_boolean(is_custom);
				_os.write_boolean(is_abstract);
				org.omg.CORBA.ValueDefHelper.write(_os,base_value);
				_os.write_boolean(is_truncatable);
				org.omg.CORBA.ValueDefSeqHelper.write(_os,abstract_base_values);
				org.omg.CORBA.InterfaceDefSeqHelper.write(_os,supported_interfaces);
				org.omg.CORBA.InitializerSeqHelper.write(_os,initializers);
				_is = _invoke(_os);
				org.omg.CORBA.ValueDef _result = org.omg.CORBA.ValueDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_value", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ValueDef _result;
			try
			{
				_result = _localServant.create_value(id,name,version,is_custom,is_abstract,base_value,is_truncatable,abstract_base_values,supported_interfaces,initializers);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.AliasDef create_alias(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_alias", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.IDLTypeHelper.write(_os,original_type);
				_is = _invoke(_os);
				org.omg.CORBA.AliasDef _result = org.omg.CORBA.AliasDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_alias", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.AliasDef _result;
			try
			{
				_result = _localServant.create_alias(id,name,version,original_type);
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
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
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

	public org.omg.CORBA.ExceptionDef create_exception(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_exception", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.StructMemberSeqHelper.write(_os,members);
				_is = _invoke(_os);
				org.omg.CORBA.ExceptionDef _result = org.omg.CORBA.ExceptionDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_exception", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ExceptionDef _result;
			try
			{
				_result = _localServant.create_exception(id,name,version,members);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.ConstantDef create_constant(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_constant", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.IDLTypeHelper.write(_os,type);
				_os.write_any(value);
				_is = _invoke(_os);
				org.omg.CORBA.ConstantDef _result = org.omg.CORBA.ConstantDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_constant", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ConstantDef _result;
			try
			{
				_result = _localServant.create_constant(id,name,version,type,value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.ModuleDef create_module(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_module", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				_is = _invoke(_os);
				org.omg.CORBA.ModuleDef _result = org.omg.CORBA.ModuleDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_module", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ModuleDef _result;
			try
			{
				_result = _localServant.create_module(id,name,version);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Contained[] lookup_name(java.lang.String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "lookup_name", true);
				_os.write_string(search_name);
				_os.write_long(levels_to_search);
				org.omg.CORBA.DefinitionKindHelper.write(_os,limit_type);
				_os.write_boolean(exclude_inherited);
				_is = _invoke(_os);
				org.omg.CORBA.Contained[] _result = org.omg.CORBA.ContainedSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "lookup_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.Contained[] _result;
			try
			{
				_result = _localServant.lookup_name(search_name,levels_to_search,limit_type,exclude_inherited);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.ContainerPackage.Description[] describe_contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "describe_contents", true);
				org.omg.CORBA.DefinitionKindHelper.write(_os,limit_type);
				_os.write_boolean(exclude_inherited);
				_os.write_long(max_returned_objs);
				_is = _invoke(_os);
				org.omg.CORBA.ContainerPackage.Description[] _result = org.omg.CORBA.ContainerPackage.DescriptionSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "describe_contents", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.ContainerPackage.Description[] _result;
			try
			{
				_result = _localServant.describe_contents(limit_type,exclude_inherited,max_returned_objs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.UnionDef create_union(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_union", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.IDLTypeHelper.write(_os,discriminator_type);
				org.omg.CORBA.UnionMemberSeqHelper.write(_os,members);
				_is = _invoke(_os);
				org.omg.CORBA.UnionDef _result = org.omg.CORBA.UnionDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_union", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.UnionDef _result;
			try
			{
				_result = _localServant.create_union(id,name,version,discriminator_type,members);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.StructDef create_struct(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_struct", true);
				_os.write_string(id);
				_os.write_string(name);
				_os.write_string(version);
				org.omg.CORBA.StructMemberSeqHelper.write(_os,members);
				_is = _invoke(_os);
				org.omg.CORBA.StructDef _result = org.omg.CORBA.StructDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_struct", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ContainerOperations _localServant = (ContainerOperations)_so.servant;
			org.omg.CORBA.StructDef _result;
			try
			{
				_result = _localServant.create_struct(id,name,version,members);
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
