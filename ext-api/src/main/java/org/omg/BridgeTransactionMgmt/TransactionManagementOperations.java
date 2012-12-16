package org.omg.BridgeTransactionMgmt;


/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public interface TransactionManagementOperations
{
	/* constants */
	/* operations  */
	void enable_transaction(int events, int timeout) throws org.omg.BridgeTransactionMgmt.TransactionAlreadyActive,org.omg.BridgeTransactionMgmt.UnsupportedTransaction;
	void disable_transaction() throws org.omg.BridgeTransactionMgmt.TransactionActive;
}
