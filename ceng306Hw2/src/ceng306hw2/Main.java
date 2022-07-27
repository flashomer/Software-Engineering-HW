package ceng306hw2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    
	public static void main(String[] args) {

		Liste fl = new Liste();
                Liste fl2 = new Liste();
                Liste fl3 = new Liste();
                
                String iTy;
                String unt;
                String amt;
                double cls;
                String des;
                String fnm;
                String fdss;
                
                
                //addPasta
                iTy = "fresh"; 
                unt = "qt.";
                amt = "1";
                cls = 100;
                des = "strawberries"; 
                
                Recipe rc1 = new Recipe(iTy,unt,amt,cls,des);
                
                fl.Recipee.add(rc1);
                
                iTy = "fresh"; 
                unt = "c.";
                amt = "3/4";
                cls = 200;
                des = "sugar";
                
                Recipe rc2 = new Recipe(iTy,unt,amt,cls,des);
                
                fl.Recipee.add(rc2);
                
                iTy = "fresh"; 
                unt = "tsp.";
                amt = "2";
                cls = 100;
                des = "strawberries";
                
                Recipe rc3 = new Recipe(iTy,unt,amt,cls,des);
                
		fl.Recipee.add(rc3);
                
                fnm = "Pasta";
                
                fdss = "Add teriyaki sauce, water chestnuts, pineapple, garlic, and ginger to the skillet; stir to combine. Turn the heat down, and simmer for about 5 minutes."; 
                
		               
                Food fd = new Food(fnm, fl.Recipee,fdss);
                
                fl.FoodList.add(fd);
                Liste.Recipee.clear();
                
                //BeefSauce
                iTy = ""; 
                unt = "pound";
                amt = "1";
                cls = 0;
                des = "lean ground beef"; 
                
                Recipe rc4 = new Recipe(iTy,unt,amt,cls,des);
                
                fl2.Recipee.add(rc4);
                
                iTy = ""; 
                unt = "cup thick";
                amt = "3/4";
                cls = 0;
                des = "teriyaki sauce";
                
                Recipe rc5 = new Recipe(iTy,unt,amt,cls,des);
                
                fl2.Recipee.add(rc5);
                
                iTy = "fresh"; 
                unt = "cup finely";
                amt = "1/2";
                cls = 100;
                des = "chopped onion";
                
                Recipe rc6 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc6);
                
                iTy = "sesame"; 
                unt = "teaspoon";
                amt = "1";
                cls = 100;
                des = "seeds";
                
                Recipe rc7 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc7);
                
                iTy = "sliced"; 
                unt = "teaspoon";
                amt = "1";
                cls = 100;
                des = "green onion";
                
                Recipe rc8 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc8);
                
                iTy = "fresh"; 
                unt = "teaspoon minced ";
                amt = "1";
                cls = 100;
                des = "ginger";
                
                Recipe rc9 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc9);
                
                fnm = "Beef Sauce";
                
                fdss = "Brown ground beef and onions in a large skillet over medium heat, crumbling as it cooks, until the beef is no longer pink and the onion is soft, about 5 minutes. Drain if necessary."; 
                
		               
                Food fd2 = new Food(fnm, fl2.Recipee,fdss);                
                fl2.FoodList.add(fd2);
                Liste.Recipee.clear();
                
                //SandwichesBatter
                iTy = "fresh"; 
                unt = "large";
                amt = "1";
                cls = 5;
                des = "egg"; 
                
                Recipe rc10 = new Recipe(iTy,unt,amt,cls,des);
                
                fl3.Recipee.add(rc10);
                
                iTy = "fresh"; 
                unt = "cup half-and-half";
                amt = "3/4";
                cls = 200;
                des = "batter";
                
                Recipe rc11 = new Recipe(iTy,unt,amt,cls,des);
                
                fl2.Recipee.add(rc11);
                
                iTy = "fresh"; 
                unt = "teaspoon";
                amt = "1";
                cls = 50;
                des = "sugar";
                
                Recipe rc12 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc12);
                
                iTy = "fresh"; 
                unt = "teaspoon";
                amt = "2";
                cls = 10;
                des = "salt";
                
                Recipe rc13 = new Recipe(iTy,unt,amt,cls,des);
                
		fl2.Recipee.add(rc13);
                
                fnm = "SandwichesBatter";
                
                fdss = "Whisk half-and-half, 1 egg, sugar, cinnamon, and salt together in a bowl until batter is smooth.\",SandwichesBatter"; 
                
		               
                Food fd3 = new Food(fnm, fl3.Recipee,fdss);                
                fl3.FoodList.add(fd3);
                
                
		System.out.println("Menu");
		System.out.println("1. List of Foods");
		System.out.println("2. Exit");
		System.out.print("Choice number:");

		Scanner input =new Scanner(System.in);
		int choice=input.nextInt();
		int choice2;
		while (choice!=2 && choice!=1){
			System.out.println("Menu");
			System.out.println("1. List of Foods");
			System.out.println("2. Exit");
			System.out.print("Choice number:");
			choice=input.nextInt();
		}
		switch (choice) {
			case 1:System.out.println(fl.FoodDisplay());
				choice2=input.nextInt();
				System.out.println(fl.CertainfoodDisplay(choice2));
                                System.out.println("Total Cal :"+ fl.GetTotalCalorie());
				break;
			case 2:
                        System.out.println(fl2.FoodDisplay());
                        choice2=input.nextInt();
                        System.out.println(fl2.CertainfoodDisplay(choice2));
                        System.out.println("Total Cal :"+ fl2.GetTotalCalorie());
                        case 3:
                        System.out.println(fl3.FoodDisplay());
                        choice2=input.nextInt();
                        System.out.println(fl3.CertainfoodDisplay(choice2));
                        System.out.println("Total Cal :"+ fl3.GetTotalCalorie());

                        break;
		}
	}
        

 public static class Liste {

	public static ArrayList<Recipe> Recipee=new ArrayList<Recipe>();
	public static ArrayList<Food> FoodList=new ArrayList<Food>();
	
	public String recipeDisplay() {
		String str="";
		for(int i =0;i<Recipee.size();i++) {
			str+=	Recipee.get(i).ItemType+" "+Recipee.get(i).Unit+" "+
					Recipee.get(i).amount+" "+Recipee.get(i).Calories+" "+
					Recipee.get(i).Description+"\n";
		}
		return str;
	}
	
	public double GetTotalCalorie() {
		double total=0;
		for(int i=0;i<Recipee.size();i++) {
			total+=Recipee.get(i).getCalories();
		}
		return total;
	}
	
	public String FoodDisplay() {
		String str="";
		for(int i =0;i<FoodList.size();i++) {
			str+=	(i+1)+". "+FoodList.get(i).FoodName+"\n";
		}
		return str;
	}
	
	public String CertainfoodDisplay(int secilen) {
		String str="";
			str+=	FoodList.get(secilen-1).FoodName+"\n************************************\n";

	for (int i =0; i<FoodList.get(secilen-1).recipee.size();i++){
		str += FoodList.get(secilen-1).recipee.get(i).toString() ;
		}
	str+="************************************\n";
	  str+=FoodList.get(secilen-1).Method;
		
		return str;
	}
	
}  
       

public static class Food {
	public String FoodName;
	public ArrayList<Recipe> recipee =new ArrayList<Recipe>();
	public String Method;

	public Food(String foodName, ArrayList<Recipe> recipee, String method) {
		super();
		FoodName = foodName;
		this.recipee = recipee;
		Method = method;
	}
	
}
       
    public static class Recipe {

	public String ItemType;
	public String Unit;
	public String amount;
	public double Calories;
	public String Description;
	
	public Recipe(String itemType, String unit, String amount, double calories, String description) {
		this.ItemType = itemType;
		this.Unit = unit;
		this.amount = amount;
		this.Calories = calories;
		this.Description = description;
	}
	
	public double getCalories() {
		return Calories;
	}

	@Override
	public String toString() {
		return
				 ItemType +" "+
				 Unit +" "+
				  amount +" "+
				 Calories +" "+
				 Description + "\n";
	}
}

	
}



