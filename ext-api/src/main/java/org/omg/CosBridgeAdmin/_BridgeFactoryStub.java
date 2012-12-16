package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public class _BridgeFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosBridgeAdmin.BridgeFactory
{
	private String[] ids = {"IDL:omg.org/CosBridgeAdmin/BridgeFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosBridgeAdmin.BridgeFactoryOperations.class;
	public org.omg.CosBridgeAdmin.Bridge create_bridge(org.omg.CosBridgeAdmin.ExternalEndpoint source, org.omg.CosBridgeAdmin.ExternalEndpoint sink, org.omg.CORBA.IntHolder id) throws org.omg.CosBridgeAdmin.InvalidExternalEndPoints
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create_bridge", true);
				org.omg.CosBridgeAdmin.ExternalEndpointHelper.write(_os,source);
				org.omg.CosBridgeAdmin.ExternalEndpointHelper.write(_os,sink);
				_is = _invoke(_os);
				org.omg.CosBridgeAdmin.Bridge _result = org.omg.CosBridgeAdmin.BridgeHelper.read(_is);
				id.value = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosBridgeAdmin/InvalidExternalEndPoints:1.0"))
					{
						throw org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_bridge", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BridgeFactoryOperations _localServant = (BridgeFactoryOperations)_so.servant;
			org.omg.CosBridgeAdmin.Bridge _result;
			try
			{
				_result = _localServant.create_bridge(source,sink,id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosBridgeAdmin.Bridge get_bridge_with_id(int id) throws org.omg.CosBridgeAdmin.BridgeNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_bridge_with_id", true);
				_os.write_long(id);
				_is = _invoke(_os);
				org.omg.CosBridgeAdmin.Bridge _result = org.omg.CosBridgeAdmin.BridgeHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosBridgeAdmin/BridgeNotFound:1.0"))
					{
						throw org.omg.CosBridgeAdmin.BridgeNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_bridge_with_id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BridgeFactoryOperations _localServant = (BridgeFactoryOperations)_so.servant;
			org.omg.CosBridgeAdmin.Bridge _result;
			try
			{
				_result = _localServant.get_bridge_with_id(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_all_bridges()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "get_all_bridges", true);
				_is = _invoke(_os);
				int[] _result = org.omg.CosBridgeAdmin.BridgeIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_bridges", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BridgeFactoryOperations _localServant = (BridgeFactoryOperations)_so.servant;
			int[] _result;
			try
			{
				_result = _localServant.get_all_bridges();
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
