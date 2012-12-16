package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetDefFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:55 PM
 */

public class _PropertySetDefFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosPropertyService.PropertySetDefFactory
{
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetDefFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosPropertyService.PropertySetDefFactoryOperations.class;
	public org.omg.CosPropertyService.PropertySetDef create_initial_propertysetdef(org.omg.CosPropertyService.PropertyDef[] initial_property_defs) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_initial_propertysetdef", true);
				org.omg.CosPropertyService.PropertyDefsHelper.write(_os,initial_property_defs);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySetDef _result = org.omg.CosPropertyService.PropertySetDefHelper.read(_is);
				return _result;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_initial_propertysetdef", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefFactoryOperations _localServant = (PropertySetDefFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySetDef _result;
			try
			{
				_result = _localServant.create_initial_propertysetdef(initial_property_defs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosPropertyService.PropertySetDef create_constrained_propertysetdef(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.PropertyDef[] allowed_property_defs) throws org.omg.CosPropertyService.ConstraintNotSupported
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_constrained_propertysetdef", true);
				org.omg.CosPropertyService.PropertyTypesHelper.write(_os,allowed_property_types);
				org.omg.CosPropertyService.PropertyDefsHelper.write(_os,allowed_property_defs);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySetDef _result = org.omg.CosPropertyService.PropertySetDefHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosPropertyService/ConstraintNotSupported:1.0"))
					{
						throw org.omg.CosPropertyService.ConstraintNotSupportedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_constrained_propertysetdef", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefFactoryOperations _localServant = (PropertySetDefFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySetDef _result;
			try
			{
				_result = _localServant.create_constrained_propertysetdef(allowed_property_types,allowed_property_defs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosPropertyService.PropertySetDef create_propertysetdef()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_propertysetdef", true);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySetDef _result = org.omg.CosPropertyService.PropertySetDefHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_propertysetdef", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetDefFactoryOperations _localServant = (PropertySetDefFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySetDef _result;
			try
			{
				_result = _localServant.create_propertysetdef();
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
