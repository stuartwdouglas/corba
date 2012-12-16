package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public class _TypedSupplierAdminStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin
{
	private String[] ids = {"IDL:omg.org/CosTypedEventChannelAdmin/TypedSupplierAdmin:1.0","IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTypedEventChannelAdmin.TypedSupplierAdminOperations.class;
	public org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer obtain_typed_push_consumer(java.lang.String supported_interface) throws org.omg.CosTypedEventChannelAdmin.InterfaceNotSupported
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "obtain_typed_push_consumer", true);
				_os.write_string(supported_interface);
				_is = _invoke(_os);
				org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _result = org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumerHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTypedEventChannelAdmin/InterfaceNotSupported:1.0"))
					{
						throw org.omg.CosTypedEventChannelAdmin.InterfaceNotSupportedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_typed_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedSupplierAdminOperations _localServant = (TypedSupplierAdminOperations)_so.servant;
			org.omg.CosTypedEventChannelAdmin.TypedProxyPushConsumer _result;
			try
			{
				_result = _localServant.obtain_typed_push_consumer(supported_interface);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "obtain_push_consumer", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ProxyPushConsumer _result = org.omg.CosEventChannelAdmin.ProxyPushConsumerHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedSupplierAdminOperations _localServant = (TypedSupplierAdminOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ProxyPushConsumer _result;
			try
			{
				_result = _localServant.obtain_push_consumer();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "obtain_pull_consumer", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ProxyPullConsumer _result = org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedSupplierAdminOperations _localServant = (TypedSupplierAdminOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ProxyPullConsumer _result;
			try
			{
				_result = _localServant.obtain_pull_consumer();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_typed_pull_consumer(java.lang.String uses_interface) throws org.omg.CosTypedEventChannelAdmin.NoSuchImplementation
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "obtain_typed_pull_consumer", true);
				_os.write_string(uses_interface);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ProxyPullConsumer _result = org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosTypedEventChannelAdmin/NoSuchImplementation:1.0"))
					{
						throw org.omg.CosTypedEventChannelAdmin.NoSuchImplementationHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_typed_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedSupplierAdminOperations _localServant = (TypedSupplierAdminOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ProxyPullConsumer _result;
			try
			{
				_result = _localServant.obtain_typed_pull_consumer(uses_interface);
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
