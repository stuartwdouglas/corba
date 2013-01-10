package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannelFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public class _TypedEventChannelFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactory
{
	private String[] ids = {"IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannelFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelFactoryOperations.class;
	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel get_typed_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_typed_event_channel", true);
				_os.write_long(id);
				_is = _invoke(_os);
				org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _result = org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/ChannelNotFound:1.0"))
					{
						throw org.omg.CosNotifyChannelAdmin.ChannelNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_typed_event_channel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedEventChannelFactoryOperations _localServant = (TypedEventChannelFactoryOperations)_so.servant;
			org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _result;
			try
			{
				_result = _localServant.get_typed_event_channel(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_all_typed_channels()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_all_typed_channels", true);
				_is = _invoke(_os);
				int[] _result = org.omg.CosNotifyChannelAdmin.ChannelIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_typed_channels", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedEventChannelFactoryOperations _localServant = (TypedEventChannelFactoryOperations)_so.servant;
			int[] _result;
			try
			{
				_result = _localServant.get_all_typed_channels();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel create_typed_channel(org.omg.CosNotification.Property[] initial_QoS, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_typed_channel", true);
				org.omg.CosNotification.PropertySeqHelper.write(_os,initial_QoS);
				org.omg.CosNotification.PropertySeqHelper.write(_os,initial_admin);
				_is = _invoke(_os);
				org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _result = org.omg.CosTypedNotifyChannelAdmin.TypedEventChannelHelper.read(_is);
				id.value = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
					{
						throw org.omg.CosNotification.UnsupportedAdminHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
					{
						throw org.omg.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_typed_channel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TypedEventChannelFactoryOperations _localServant = (TypedEventChannelFactoryOperations)_so.servant;
			org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel _result;
			try
			{
				_result = _localServant.create_typed_channel(initial_QoS,initial_admin,id);
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
