package com.driver;

public class Pizza {
    private String bill ="";
    private Boolean isVeg;
    private int price = 0;

    private boolean ChessAddextra = false;
    private  boolean ToppingAddextra= false;
    private boolean takeaway = false;

    // price of items According to the app
    private int vegpizza = 300;
    private int nonvegpizza = 400;
    private  int extracheez = 80;
    private  int vegtoping = 70;
    private  int nonvegtoping = 120;
    private  int papperbag = 20;






    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes her
        if(isVeg == true){
            this.price+=vegpizza;
            this.bill+="Pizza price is: "+vegpizza+"\n";
        }else{
            this.price+=nonvegpizza;
            this.bill+="Pizza Non veg price is : "+nonvegpizza+"\n";
        }


    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (ChessAddextra == false) {
            this.price+=extracheez;
            ChessAddextra = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(ToppingAddextra == false){
            if(this.isVeg == true){
                this.price += vegtoping;
            }else{
                this.price+= nonvegtoping;
            }
            ToppingAddextra = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway == false){
            this.price+= papperbag;
            takeaway = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(ToppingAddextra == true){
            if(isVeg = true){
                this.bill+="Adding Extra Topping Veg :"+vegtoping+"\n";
            }else{
                this.bill+="Adding a Extra Topping :"+nonvegtoping+"\n";
            }
        }
        if(ChessAddextra = true){
            this.bill+="Adding Extra Cheez: "+extracheez+"\n";
        }
        if(takeaway == true){
            this.bill+="taking paper packet :"+papperbag+"\n";
        }
        this.bill+="Total bill:"+this.price+"\n"+"Thank You for Visiting Us";
        return this.bill;
    }
}