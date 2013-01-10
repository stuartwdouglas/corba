package org.omg.CosPropertyService;


/**
 * Generated from IDL interface "PropertySetFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public class _PropertySetFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosPropertyService.PropertySetFactory
{
	private String[] ids = {"IDL:omg.org/CosPropertyService/PropertySetFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosPropertyService.PropertySetFactoryOperations.class;
	public org.omg.CosPropertyService.PropertySet create_propertyset()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_propertyset", true);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySet _result = org.omg.CosPropertyService.PropertySetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_propertyset", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetFactoryOperations _localServant = (PropertySetFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySet _result;
			try
			{
				_result = _localServant.create_propertyset();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosPropertyService.PropertySet create_constrained_propertyset(org.omg.CORBA.TypeCode[] allowed_property_types, org.omg.CosPropertyService.Property[] allowed_properties) throws org.omg.CosPropertyService.ConstraintNotSupported
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_constrained_propertyset", true);
				org.omg.CosPropertyService.PropertyTypesHelper.write(_os,allowed_property_types);
				org.omg.CosPropertyService.PropertiesHelper.write(_os,allowed_properties);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySet _result = org.omg.CosPropertyService.PropertySetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_constrained_propertyset", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetFactoryOperations _localServant = (PropertySetFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySet _result;
			try
			{
				_result = _localServant.create_constrained_propertyset(allowed_property_types,allowed_properties);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosPropertyService.PropertySet create_initial_propertyset(org.omg.CosPropertyService.Property[] initial_properties) throws org.omg.CosPropertyService.MultipleExceptions
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_initial_propertyset", true);
				org.omg.CosPropertyService.PropertiesHelper.write(_os,initial_properties);
				_is = _invoke(_os);
				org.omg.CosPropertyService.PropertySet _result = org.omg.CosPropertyService.PropertySetHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_initial_propertyset", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PropertySetFactoryOperations _localServant = (PropertySetFactoryOperations)_so.servant;
			org.omg.CosPropertyService.PropertySet _result;
			try
			{
				_result = _localServant.create_initial_propertyset(initial_properties);
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
