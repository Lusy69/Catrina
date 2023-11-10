/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entites;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author galaz
 */
public class Report {
    
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transaction> transactions;


     public Report deserialize(String json){
        
        Report report = new Report();
        try{
           report= new Gson ().fromJson(json, Report.class);
        }catch(Exception ex){
            System.err.print("Ocurio un error: "+ex.getMessage());
        }
        return report;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Iterable<Transaction> getTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
    public void bubbleSort(int[] dfd , int nElementos){
        
        int auxiliar;
        
        for (int i = 0; i < nElementos-1; i++){
            
            for(int j = 0; j < nElementos-1; j++){
                
                if (dfd[j] > dfd[j+1]){
                    
                    auxiliar = dfd[j];
                    dfd[j] = dfd[j+1];
                    dfd[j+1] = auxiliar;
                    
                }
                
            }
            
        }
        
    }
     
    
    
    
}
