/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.steam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liweifan
 * @version $Id: Transction_7, v 0.1 2018/1/3 下午5:40 liweifan Exp $
 */
public class TransactionTest {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, 10, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(3, 30, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(6, 60, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(5, 50, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(2, 20, Transaction.Type.A));
        transactions.add(new Transaction(4, 40, Transaction.Type.C));

//        List<Transaction> groceryTransactions = new ArrayList<>();
//        for (Transaction transaction : transactions) {
//            if (transaction.getType() == Transaction.Type.GEOCERY) {
//                groceryTransactions.add(transaction);
//            }
//        }
//
//        Collections.sort(groceryTransactions, new Comparator<Transaction>() {
//            @Override
//            public int compare(Transaction o1, Transaction o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//
//        List<Integer> transactionIds = new ArrayList<>();
//        for (Transaction groceryTransaction : groceryTransactions) {
//            transactionIds.add(groceryTransaction.getId());
//        }
//        System.out.println(transactionIds);

        List<Integer> transactionsIds =
                transactions.stream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());
        System.out.println(transactionsIds);
    }
}