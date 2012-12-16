package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynAnyFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public class _DynAnyFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DynamicAny.DynAnyFactory
{
	private String[] ids = {"IDL:omg.org/DynamicAny/DynAnyFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DynamicAny.DynAnyFactoryOperations.class;
	public org.omg.DynamicAny.DynAny create_dyn_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_dyn_any", true);
				_os.write_any(value);
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
					if( _id.equals("IDL:omg.org/DynamicAny/DynAnyFactory/InconsistentTypeCode:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_dyn_any", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynAnyFactoryOperations _localServant = (DynAnyFactoryOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.create_dyn_any(value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DynamicAny.DynAny create_dyn_any_from_type_code(org.omg.CORBA.TypeCode type) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_dyn_any_from_type_code", true);
				_os.write_TypeCode(type);
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
					if( _id.equals("IDL:omg.org/DynamicAny/DynAnyFactory/InconsistentTypeCode:1.0"))
					{
						throw org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_dyn_any_from_type_code", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			DynAnyFactoryOperations _localServant = (DynAnyFactoryOperations)_so.servant;
			org.omg.DynamicAny.DynAny _result;
			try
			{
				_result = _localServant.create_dyn_any_from_type_code(type);
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