package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheese;
    private Boolean extraToppings;
    private Boolean isTakeAway;
    private Boolean billGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        }else{
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }
        extraCheese = false;
        extraToppings = false;
        isTakeAway = false;
        billGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == true){
            return;
        }
        extraCheese = true;
        this.price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == true){
            return;
        }
        extraToppings = true;
        if(isVeg == true){
            this.price += 70;
        }else{
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway == true){
            return;
        }
        isTakeAway = true;
        this.price += 20;
    }

    public String getBill(){
        // your code goes here
        if(billGenerated == false){
            billGenerated = true;
            if(extraCheese == true){
                bill += "Extra Cheese Added: 80\n";
            }
            if(extraToppings == true){
                if(isVeg == true){
                    bill += "Extra Toppings Added: 70\n";
                }else{
                    bill += "Extra Toppings Added: 120\n";
                }
            }
            if(isTakeAway == true){
                bill += "Paperbag Added: 20\n";
            }
            bill += "Total Price: " + this.price + "\n";

        }
        return this.bill;
    }
}