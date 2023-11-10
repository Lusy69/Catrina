/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entites;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.catrina.enums.TypeTransaction;

/**
 *
 * @author galaz
 */
public class Transaction {
    private Date date;
    private String description;
    private double amount;
    @SerializedName ("type")
    private TypeTransaction typeTransaction;

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the typeTransaction
     */
    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    /**
     * @param typeTransaction the typeTransaction to set
     */
    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
    
    
        public static void bubbleSortDates(Date[] dates) {
        int n = dates.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar las fechas usando el método compareTo
                if (dates[j].compareTo(dates[j + 1]) > 0) {
                    // Intercambiar fechas
                    Date temp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = temp;
                }
            }
        }
    }

    public static void printDates(Date[] dates) {
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }
    }
    
}

    