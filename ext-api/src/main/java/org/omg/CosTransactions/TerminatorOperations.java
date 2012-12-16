package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Terminator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public interface TerminatorOperations
{
	/* constants */
	/* operations  */
	void commit(boolean report_heuristics) throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed;
	void rollback();
}
