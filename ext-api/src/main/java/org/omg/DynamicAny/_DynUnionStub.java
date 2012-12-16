package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynUnion".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public class _DynUnionStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DynamicAny.DynUnion
{
	private String[] ids = {"IDL:omg.org/DynamicAny/DynUnion:1.0","IDL:omg.org/DynamicAny/DynAny:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DynamicAny.DynUnionOperations.class;
	public org.omg.CORBA.Object get_reference() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_reference", true);
				_is = _invoke(_os);
				org.omg.CORBA.Object _result = _is.read_Object();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_reference", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.Object _result;
			try
			{
				_result = _localServant.get_reference();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_typecode(org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_typecode", true);
				_os.write_TypeCode(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_typecode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_typecode(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.TypeCode get_typecode() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_typecode", true);
				_is = _invoke(_os);
				org.omg.CORBA.TypeCode _result = _is.read_TypeCode();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_typecode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.TypeCode _result;
			try
			{
				_result = _localServant.get_typecode();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_to_default_member() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_to_default_member", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_to_default_member", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.set_to_default_member();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DynamicAny.DynAny copy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "copy", true);
				_is = _invoke(_os);
				org.omg.DynamicAny.DynAny _result = org.omg.DynamicAny.DynAnyHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "copy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.copy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int get_ulong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_ulong", true);
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
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_ulong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.get_ulong();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_float(float value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_float", true);
				_os.write_float(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_float", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_float(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.Any get_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_any", true);
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
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.Any _result;
			try
			{
				_result = _localServant.get_any();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public short get_short() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_short", true);
				_is = _invoke(_os);
				short _result = _is.read_short();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_short", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			short _result;
			try
			{
				_result = _localServant.get_short();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void from_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "from_any", true);
				_os.write_any(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "from_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.from_any(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public java.lang.String get_string() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_string", true);
				_is = _invoke(_os);
				java.lang.String _result = _is.read_string();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_string", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_string();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public float get_float() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_float", true);
				_is = _invoke(_os);
				float _result = _is.read_float();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_float", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			float _result;
			try
			{
				_result = _localServant.get_float();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_ulonglong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_ulonglong", true);
				_os.write_ulonglong(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_ulonglong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_ulonglong(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_reference(org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_reference", true);
				_os.write_Object(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_reference", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_reference(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_string(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_string", true);
				_os.write_string(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_string", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_string(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DynamicAny.DynAny current_component() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "current_component", true);
				_is = _invoke(_os);
				org.omg.DynamicAny.DynAny _result = org.omg.DynamicAny.DynAnyHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "current_component", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.current_component();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean get_boolean() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_boolean", true);
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
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_boolean", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.get_boolean();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_boolean(boolean value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_boolean", true);
				_os.write_boolean(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_boolean", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_boolean(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.TCKind discriminator_kind()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "discriminator_kind", true);
				_is = _invoke(_os);
				org.omg.CORBA.TCKind _result = org.omg.CORBA.TCKindHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "discriminator_kind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.TCKind _result;
			try
			{
				_result = _localServant.discriminator_kind();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean next()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "next", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "next", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.next();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_char(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_char", true);
				_os.write_char(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_char", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_char(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_wstring(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_wstring", true);
				_os.write_wstring(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_wstring", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_wstring(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean has_no_active_member()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "has_no_active_member", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "has_no_active_member", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.has_no_active_member();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DynamicAny.DynAny get_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_dyn_any", true);
				_is = _invoke(_os);
				org.omg.DynamicAny.DynAny _result = org.omg.DynamicAny.DynAnyHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_dyn_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.get_dyn_any();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Any to_any()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "to_any", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "to_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.Any _result;
			try
			{
				_result = _localServant.to_any();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public char get_char() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_char", true);
				_is = _invoke(_os);
				char _result = _is.read_char();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_char", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			char _result;
			try
			{
				_result = _localServant.get_char();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean seek(int index)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "seek", true);
				_os.write_long(index);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "seek", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.seek(index);
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
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
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

	public void insert_short(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_short", true);
				_os.write_short(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_short", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_short(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.TypeCode type()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "type", true);
				_is = _invoke(_os);
				org.omg.CORBA.TypeCode _result = _is.read_TypeCode();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "type", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.TypeCode _result;
			try
			{
				_result = _localServant.type();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.TCKind member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "member_kind", true);
				_is = _invoke(_os);
				org.omg.CORBA.TCKind _result = org.omg.CORBA.TCKindHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "member_kind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.CORBA.TCKind _result;
			try
			{
				_result = _localServant.member_kind();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_double(double value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_double", true);
				_os.write_double(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_double", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_double(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public long get_longlong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_longlong", true);
				_is = _invoke(_os);
				long _result = _is.read_longlong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_longlong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			long _result;
			try
			{
				_result = _localServant.get_longlong();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_to_no_active_member() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_to_no_active_member", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_to_no_active_member", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.set_to_no_active_member();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int component_count()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "component_count", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "component_count", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.component_count();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_wchar(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_wchar", true);
				_os.write_wchar(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_wchar", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_wchar(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_any", true);
				_os.write_any(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_any(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_ushort(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_ushort", true);
				_os.write_ushort(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_ushort", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_ushort(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public java.lang.String member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "member_name", true);
				_is = _invoke(_os);
				java.lang.String _result = _is.read_string();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "member_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.member_name();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public short get_ushort() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_ushort", true);
				_is = _invoke(_os);
				short _result = _is.read_ushort();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_ushort", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			short _result;
			try
			{
				_result = _localServant.get_ushort();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String get_wstring() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_wstring", true);
				_is = _invoke(_os);
				java.lang.String _result = _is.read_wstring();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_wstring", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			java.lang.String _result;
			try
			{
				_result = _localServant.get_wstring();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DynamicAny.DynAny get_discriminator()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_discriminator", true);
				_is = _invoke(_os);
				org.omg.DynamicAny.DynAny _result = org.omg.DynamicAny.DynAnyHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_discriminator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.get_discriminator();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int get_long() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_long", true);
				_is = _invoke(_os);
				int _result = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_long", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.get_long();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void assign(org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "assign", true);
				org.omg.DynamicAny.DynAnyHelper.write(_os,dyn_any);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assign", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.assign(dyn_any);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public char get_wchar() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_wchar", true);
				_is = _invoke(_os);
				char _result = _is.read_wchar();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_wchar", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			char _result;
			try
			{
				_result = _localServant.get_wchar();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_longlong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_longlong", true);
				_os.write_longlong(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_longlong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_longlong(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_long(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_long", true);
				_os.write_long(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_long", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_long(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_dyn_any(org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_dyn_any", true);
				org.omg.DynamicAny.DynAnyHelper.write(_os,value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_dyn_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_dyn_any(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void rewind()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "rewind", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rewind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.rewind();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void insert_ulong(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_ulong", true);
				_os.write_ulong(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_ulong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_ulong(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public long get_ulonglong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_ulonglong", true);
				_is = _invoke(_os);
				long _result = _is.read_ulonglong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_ulonglong", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			long _result;
			try
			{
				_result = _localServant.get_ulonglong();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void insert_octet(byte value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "insert_octet", true);
				_os.write_octet(value);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "insert_octet", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.insert_octet(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean equal(org.omg.DynamicAny.DynAny dyn_any)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "equal", true);
				org.omg.DynamicAny.DynAnyHelper.write(_os,dyn_any);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "equal", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			boolean _result;
			try
			{
				_result = _localServant.equal(dyn_any);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public double get_double() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_double", true);
				_is = _invoke(_os);
				double _result = _is.read_double();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_double", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			double _result;
			try
			{
				_result = _localServant.get_double();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public byte get_octet() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_octet", true);
				_is = _invoke(_os);
				byte _result = _is.read_octet();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_octet", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			byte _result;
			try
			{
				_result = _localServant.get_octet();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_discriminator(org.omg.DynamicAny.DynAny d) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "set_discriminator", true);
				org.omg.DynamicAny.DynAnyHelper.write(_os,d);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_discriminator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			try
			{
				_localServant.set_discriminator(d);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DynamicAny.DynAny member() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "member", true);
				_is = _invoke(_os);
				org.omg.DynamicAny.DynAny _result = org.omg.DynamicAny.DynAnyHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/DynamicAny/DynAny/InvalidValue:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "member", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynUnionOperations _localServant = (DynUnionOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.member();
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
