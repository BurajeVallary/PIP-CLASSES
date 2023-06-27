fun main() {




    val recipes = Recipe(   arrayOf("Rice", "Spices"), "one hour",
        "fry the meat till golden under low heat", "proteins and energy")
    val ethiopianRecipe = EthiopianRecipe("grounded wheat", arrayOf("Wheat", "brown wheat"),
        " am maximum of three days",
        "ferment the flour the fry it under low heat for two minute",
        "energy"
    )
    ethiopianRecipe.ethiopiansSpecial()



   val recipes = Recipe(   arrayOf("Rice", "Spices"), "one hour",
       "fry the meat till golden under low heat", "proteins and energy")
   val ethiopianRecipe = EthiopianRecipe("grounded wheat", arrayOf("Wheat", "brown wheat"),
       " am maximum of three days",
       "ferment the flour the fry it under low heat for two minute",
       "energy"
   )
   ethiopianRecipe.ethiopiansSpecial()




 
 
 }
 
 
 
 
 open class Recipe(var ingredients: Array<String>, var preparationTime: String, val cookingMethod: String, var nutritionalValue: String) {
 
 
    fun getIngredients() {

        println("The ingredients is $ingredients")

 
 
    }
 fun checkallergerns(){
    if (allergens == null)
    allergens=arrayOf<String>(){
    else{
        print(allergens[0])
        }
 }


    fun getPreparationTime() {
        println("$preparationTime ")


 
 
    }
 
 
 
 
    fun getCookingMethod() {
        println("$cookingMethod")

 
 
    }
 
 
 
 
    fun servingportions(){
        println("$servingPortion")
        }
       
    }
 
 }
 
 
 class MorrocanRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    
 nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
    fun specialRecipe() {
        println("The special recipe of Morocco is $specialIngredient")
 
 
    }
 
 
 }
 
 
 
 
 class EthiopianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
 
 
    fun ethiopiansSpecial() {
        println("The special recipe of Ethiopia is $specialIngredient")
 
 
 
 
    }
 
 
 }
 
 
 class NigerianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
 
 
    fun nigerianSpecial() {
        println("The special recipe of Nigeria is $specialIngredient ")
       
    }
 }





 //
// 2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
// The app needs to handle recipes from different African countries, each with its
// unique ingredients, preparation time, cooking method, and nutritional
// information. Consider creating a `Recipe` class, and think about how you might
// create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
// `EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
// Methods.





open class Recipe(var ingredients: Array<String>, var preparationTime: String, val cookingMethod: String, var nutritionalValue: String) {


   fun getIngredients() {
       println("The ingredients is $ingredients")


   }


   fun getPreparationTime() {
       println("$preparationTime ")


   }




   fun getCookingMethod() {
       println("$cookingMethod")


   }




   fun getNutritionalInformation() {
       println("$nutritionalValue")


   }


}
class MorrocanRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
   
nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
   fun specialRecipe() {
       println("The special recipe of Morocco is $specialIngredient")


   }


}




class EthiopianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
   nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {


   fun ethiopiansSpecial() {
       println("The special recipe of Ethiopia is $specialIngredient")




   }


}


class NigerianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
   nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {


   fun nigerianSpecial() {
       println("The special recipe of Nigeria is $specialIngredient ")
      
   }
}






 
 
 
 
 
 
 
 
 
 