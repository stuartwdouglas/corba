package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public class _TransactionFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTransactions.TransactionFactory
{
	private String[] ids = {"IDL:omg.org/CosTransactions/TransactionFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTransactions.TransactionFactoryOperations.class;
	public org.omg.CosTransactions.Control create(int time_out)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "create", true);
				_os.write_ulong(time_out);
				_is = _invoke(_os);
				org.omg.CosTransactions.Control _result = org.omg.CosTransactions.ControlHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TransactionFactoryOperations _localServant = (TransactionFactoryOperations)_so.servant;
			org.omg.CosTransactions.Control _result;
			try
			{
				_result = _localServant.create(time_out);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "recreate", true);
				org.omg.CosTransactions.PropagationContextHelper.write(_os,ctx);
				_is = _invoke(_os);
				org.omg.CosTransactions.Control _result = org.omg.CosTransactions.ControlHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "recreate", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			TransactionFactoryOperations _localServant = (TransactionFactoryOperations)_so.servant;
			org.omg.CosTransactions.Control _result;
			try
			{
				_result = _localServant.recreate(ctx);
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
