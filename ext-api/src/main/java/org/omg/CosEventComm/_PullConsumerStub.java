package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public class _PullConsumerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosEventComm.PullConsumer
{
	private String[] ids = {"IDL:omg.org/CosEventComm/PullConsumer:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosEventComm.PullConsumerOperations.class;
	public void disconnect_pull_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "disconnect_pull_consumer", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PullConsumerOperations _localServant = (PullConsumerOperations)_so.servant;
			try
			{
				_localServant.disconnect_pull_consumer();
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
