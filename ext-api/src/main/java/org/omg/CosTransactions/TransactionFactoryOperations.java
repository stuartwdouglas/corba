package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public interface TransactionFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Control create(int time_out);
	org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx);
}
