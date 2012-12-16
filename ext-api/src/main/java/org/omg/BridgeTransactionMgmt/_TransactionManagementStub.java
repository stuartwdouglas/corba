package org.omg.BridgeTransactionMgmt;


/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public class _TransactionManagementStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.BridgeTransactionMgmt.TransactionManagement
{
	private String[] ids = {"IDL:omg.org/BridgeTransactionMgmt/TransactionManagement:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.BridgeTransactionMgmt.TransactionManagementOperations.class;
	public void disable_transaction() throws org.omg.BridgeTransactionMgmt.TransactionActive
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "disable_transaction", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/BridgeTransactionMgmt/TransactionActive:1.0"))
					{
						throw org.omg.BridgeTransactionMgmt.TransactionActiveHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disable_transaction", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TransactionManagementOperations _localServant = (TransactionManagementOperations)_so.servant;
			try
			{
				_localServant.disable_transaction();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void enable_transaction(int events, int timeout) throws org.omg.BridgeTransactionMgmt.TransactionAlreadyActive,org.omg.BridgeTransactionMgmt.UnsupportedTransaction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "enable_transaction", true);
				_os.write_ulong(events);
				_os.write_ulong(timeout);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/BridgeTransactionMgmt/TransactionAlreadyActive:1.0"))
					{
						throw org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.read(_ax.getInputStream());
					}
					else 
					if( _id.equals("IDL:omg.org/BridgeTransactionMgmt/UnsupportedTransaction:1.0"))
					{
						throw org.omg.BridgeTransactionMgmt.UnsupportedTransactionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enable_transaction", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TransactionManagementOperations _localServant = (TransactionManagementOperations)_so.servant;
			try
			{
				_localServant.enable_transaction(events,timeout);
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
